package com.java.adweb.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentModal{
	public void main(String[] args) throws Exception {
		add(null);
		update(null);
		delete(null);
		//search(null);
	}
	public void add(Student bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?,?,?)");	
		
		ps.setInt(1, bean.getId());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getFirstName());
		ps.setString(4, bean.getLastName());
		ps.setString(5, bean.getSession());
		
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("inserted");
		
	
		ps.close();
		conn.close();
	}
	
	public void update(Student bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("update STUDENT set rollNo=?,FIRSTNAME=?,LASTNAME=?,SESSION=? where ID=?");	
		
		ps.setString(1, bean.getRollNo());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getSession());
		
		ps.executeUpdate();
		conn.commit();
		System.out.println("updated");
		
	
		ps.close();
		conn.close();
	}
	
	public void delete(Student bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("delete from STUDENT where Id=?");	
		ps.setInt(1,bean.getId());
		ps.executeUpdate();
		conn.commit();
		System.out.println("deleted");
		
	
		ps.close();
		conn.close();
	}
	public Student getRollNo(String RollNo) throws Exception {
		Student bean = new Student();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		//conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM STUDENT WHERE rollNo=?");	
		ps.setString(1, RollNo);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			bean.setId(rs.getInt(1));
			//bean.setRollNo(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
			bean.setSession(rs.getString(5));
		}
		
		//conn.commit();
		ps.close();
		conn.close();
		return bean;
	}
	public ArrayList<Student> listAll() throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech", "root", "root");
		PreparedStatement ps = conn.prepareStatement("SELECT* FROM STUDENT");
		ResultSet rs= ps.executeQuery();
		ArrayList<Student> list=new ArrayList<Student>();
		while(rs.next()) {
			Student bean= new Student();
			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
			bean.setFirstName(rs.getString(3));
			bean.setLastName(rs.getString(4));
			bean.setSession(rs.getString(5));
			list.add(bean);
		}
		ps.close();
		conn.close();
		return list;		
		
	}

	/*public static void search() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT* FROM STUDENT");	
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			System.out.println("\t"+rs.getString(4));
			System.out.println("\t"+rs.getString(5));
		}
		conn.commit();
		ps.close();
		conn.close();		
	}*/
}