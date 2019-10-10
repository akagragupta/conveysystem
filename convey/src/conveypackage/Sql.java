package conveypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.http.HttpSession;
import javax.servlet.*;

public class Sql {
		Connection conn = null;
		public Sql() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/convey","root","1998");
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		public boolean login(String username, String password) 
		{
			try {
				System.out.print(username+password);
			String query="select name, password from user where name=? and password=?; ";
			PreparedStatement stmt= conn.prepareStatement(query);
			stmt.setString(1,username );
			stmt.setString(2, password );
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
					return true;
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("username or password does not match");
				return false;
			}
			return false;
		}
		
		
		public boolean adduser(String name, String address, String college, String hostel, String room, int postal,
				int phone, String payment_methods, String passwords) {
			try {
				String query="INSERT INTO USER(name,address,college,hostel,room,postalcode,phone,payments_method,password) VALUES(?,?,?,?,?,?,?,?,?);";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setString(1,name );
				stmt.setString(2, address );
				stmt.setString(3, college );
				stmt.setString(4, hostel );
				stmt.setString(5, room );
				stmt.setInt(6, postal );
				stmt.setInt(7,phone  );
				stmt.setString(8, payment_methods );
				stmt.setString(9, passwords );
				int rs = stmt.executeUpdate();
				System.out.println(rs);
				if(rs>0)
					return true;
				}
				catch(Exception e) {
					e.printStackTrace();
					return false;
				}
				return false;
			
		}
		
		public boolean addproduct(String name, int price, String quantity, String time, int tip, String desc,int id ,String category) {
			try {
				String query="INSERT INTO PRODUCT(name,PRICE,quantity,time,extra_payment,description,Addedby,category,in_delivery) VALUES(?,?,?,?,?,?,?,?,?);  ";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setString(1,name );
				stmt.setInt(2, price );
				stmt.setString(3, quantity );
				stmt.setString(4, time );
				stmt.setInt(5, tip );
				stmt.setString(6, desc );
				stmt.setInt(7, id);
				stmt.setString(8, category);
				stmt.setString(9,"No");
				int rs = stmt.executeUpdate();
				System.out.println(rs);
				if(rs>0) {
					System.out.println("success in adding product");
					return true;
				}
				}
				catch(Exception e) {
					System.out.println("error in adding product");
					e.printStackTrace();
					return false;
				}
			System.out.println("error in adding product");
			return false;
			
		}
		
		public ResultSet pickproduct() {
			try {
				String query="Select * from product";
				PreparedStatement stmt= conn.prepareStatement(query);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in pickproduct sql ");
				return rs;
			}
			catch(Exception e) {
				System.out.println("error in pickproduct sql ");
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet pickproduct(int id) {
			try {
				String query="Select * from product where Addedby=?";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setInt(1,id );
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in pickproduct sql ");
				return rs;
			}
			catch(Exception e) {
				System.out.println("error in pickproduct sql ");
				e.printStackTrace();
			}
			return null;
		}
		public boolean removefromofferpage(int id) {
			try {
				String query="update product set in_delivery=\"Yes\" where pid=?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1,id);
				int rs = stmt.executeUpdate();
				System.out.println(rs);
				System.out.println(id);
				if(rs>0) {
					System.out.println("rs>0");
					return true;
				}
			}
			catch(Exception e) {
				System.out.println("product deliver servlet sql failed");
				e.printStackTrace();
			}
			
			return false;
		}
		
		
		public boolean adddelivery(int pid, int id) {
			// TODO Auto-generated method stub
			try {
				String query="INSERT INTO DELIVERY(uid, pid, status, deliverby) select product.Addedby, product.pid,\"not updated\",? from product where pid=?;";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1,id);
				stmt.setInt(2,pid);
				int rs = stmt.executeUpdate();
				
				if(rs>0) {
					System.out.println("rs>0");
					return true;
				}
			}
			catch(Exception e) {
				System.out.println("product deliver servlet sql failed");
				e.printStackTrace();
			}
			return false;
		} 
		public ResultSet pickprofile(String username) {
			// TODO Auto-generated method stub
			try {
				String query="Select * from user where name=?";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setString(1, username);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in pickproduct sql ");
				return rs;
			}
			catch(Exception e) {
				System.out.println("error in pickproduct sql ");
				e.printStackTrace();
			}
			return null;
		}
		
		public int getid(String username) {
			try {
				System.out.println("0");
				String query="Select uid from user where name=?";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setString(1, username);
				ResultSet rs= stmt.executeQuery();
				System.out.println("1");
				while(rs.next()) {
					System.out.println("2");
					int id=rs.getInt(1);
					return id;	
				}
			}
		catch(Exception e) {
			e.printStackTrace();
				System.out.println("error in getting id");
			}
		return 0;
		}
		public ResultSet showdeliveryinfo(int id, int pid) {
			try {
				String query="select p.name, p.quantity, p.price, p.extra_payment, p.time, p.description,u.name, d.status, u1.name, u1.address, d.oid from delivery d inner join product p on d.pid=p.pid   inner join user u on d.deliverby=u.uid  inner join user u1 on d.uid=u1.uid  where d.deliverby=? and p.pid=?;  ";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setInt(1,id);
				stmt.setInt(2,pid);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in pickdelivery sql ");
				return rs;
			}
			catch(Exception e) {
				System.out.println("error in pickdelivery sql ");
				e.printStackTrace();
			}
			return null;
		}
		
		
		public ResultSet pickdelivery(int id) {
			try {
				String query="select p.name, p.quantity, p.price, p.extra_payment, p.time, p.description,u.name, d.status, u1.name, u1.address, d.oid from delivery d inner join product p on d.pid=p.pid   inner join user u on d.deliverby=u.uid  inner join user u1 on d.uid=u1.uid  where d.deliverby=?;  ";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setInt(1,id);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in pickdelivery sql ");
//				while(rs.next())
//				{
//					System.out.println("print or not");
//					System.out.println(rs.getString(1));
//				}
				return rs;
			}
			catch(Exception e) {
				System.out.println("error in pickdelivery sql ");
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet pickorder(int id) {
			try {
				String query="select * from product where Addedby=?;  ";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setInt(1,id);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in pickdelivery sql ");
				return rs;
			}
			catch(Exception e) {
				System.out.println("error in pickdelivery sql ");
				e.printStackTrace();
			}
			return null;
		}
		
		
		public boolean canceldelivery(int oid) {
			try {
				String query="delete from delivery where oid =?";
				PreparedStatement stmt= conn.prepareStatement(query);
				stmt.setInt(1, oid);
				int rs= stmt.executeUpdate();
				if(rs>0) {
				System.out.println("success in canceldelivery sql ");
				}
				return true;
			}
			catch(Exception e) {
				System.out.println("error in canceldelivery sql ");
				e.printStackTrace();
			}
			return false;
		}
		
		public int getpidfromoid(int oid) {
			try {
				String query="select pid from delivery where oid=?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1,oid);
				ResultSet rs = stmt.executeQuery();
				while(rs.next()) {
					return rs.getInt(1);
				}
			}
			catch(Exception e) {
				System.out.println("error in getpidfromoid in Sql.java");
				e.printStackTrace();
			}
			return 0;
		}
		
		public boolean canceldelvieryaddproduct(int id) {
			try {
				String query="update product set in_delivery=\"No\" where pid=?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1,id);
				int rs = stmt.executeUpdate();
				System.out.println(rs);
				System.out.println(id);
				if(rs>0) {
					System.out.println("rs>0");
					return true;
				}
			}
			catch(Exception e) {
				System.out.println("canceldelvieryaddproduct sql failed");
				e.printStackTrace();
			}
			
			return false;
		}
		public boolean deleteproduct(int pid) {
			try {
				String query="delete from product where pid=?";
				PreparedStatement stmt = conn.prepareStatement(query);
				stmt.setInt(1,pid);
				int rs = stmt.executeUpdate();
				if(rs>0) {
					System.out.println("rs>0");
					return true;
				}
			}
			catch(Exception e) {
				System.out.println("canceldelvieryaddproduct sql failed");
				e.printStackTrace();
			}
			
			return false;
		}
		public int getoidfrompid(int pid) {
			try {
				String query="select oid from delivery where pid=?";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setInt(1,pid);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in getoidfrompid sql ");
				while(rs.next()) {
					return rs.getInt(1);
				}
			}
			catch(Exception e) {
				System.out.println("error in getoidfrompid sql ");
				e.printStackTrace();
			}
			return 0;
		}
		public int getdeliveryidfromoid(int oid) {
			try {
				String query="select deliverby from delivery where oid=?";
				PreparedStatement stmt=conn.prepareStatement(query);
				stmt.setInt(1,oid);
				ResultSet rs= stmt.executeQuery();
				System.out.println("success in getdeliveryidfromoid sql ");
				while(rs.next()) {
					return rs.getInt(1);
				}
			}
			catch(Exception e) {
				System.out.println("error in getdeliveryidfromoid sql ");
				e.printStackTrace();
			}
			return 0;
		}
		
		
		
}
