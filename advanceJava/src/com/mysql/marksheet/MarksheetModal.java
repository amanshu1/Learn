package com.mysql.marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MarksheetModal {
	public void add(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO MARKSHEET VALUES(?,?,?,?,?,?)");	
		
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getName());
		ps.setInt(4, bean.getC());
		ps.setInt(5, bean.getP());
		ps.setInt(6, bean.getM());
		
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("inserted");
		
	
		ps.close();
		conn.close();
	}
	
	public void update(MarksheetBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update MARKSHEET set rollNo=?,name=?,c=?,p=?,m=? where id=?");	
		
		ps.setString(1, bean.getRollNo());
		ps.setString(2, bean.getName());
		ps.setInt(3, bean.getC());
		ps.setInt(4, bean.getP());
		ps.setInt(5, bean.getM());
		ps.setInt(6, bean.getId());
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("updated");
		
	
		ps.close();
		conn.close();
	}
	
	public void delete(String rollNO) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from MARKSHEET where rollNO=?");	
		
		ps.setString(1,rollNO);
		
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("deleted");
		
	
		ps.close();
		conn.close();
	}
	public static void get(String rollNo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT* FROM MARKSHEET WHERE rollNo=?");	
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			System.out.println("\t"+rs.getString(4));
			System.out.println("\t"+rs.getString(5));
			System.out.println("\t"+rs.getString(6));
		}
		
		conn.commit();
		ps.close();
		conn.close();
	}
	public static void getMeritList(String rollNo) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT*,((p+c+m)/300)*100 as percentage  FROM MARKSHEET order by percentage desc");	
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			System.out.println("\t"+rs.getString(4));
			System.out.println("\t"+rs.getString(5));
			System.out.println("\t"+rs.getString(6));
		}
		
		conn.commit();
		ps.close();
		conn.close();
	}
	
	
	public static void search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT* FROM MARKSHEET");	
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			System.out.println("\t"+rs.getString(4));
			System.out.println("\t"+rs.getString(5));
			System.out.println("\t"+rs.getString(6));
		}
		conn.commit();
		ps.close();
		conn.close();		
	}

}
