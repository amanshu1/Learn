package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Prepared1 {
	public static void main(String[] args) throws Exception {
		//testSelect();
		testInsert();
		//testDelete();	
	}

	public static void testInsert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
		int id=5;
		String fname="DISHA";
		String lname="PAMNANI";
		String gender="FEMALE";
		int age=19;
		int edu_id=5;
		
		PreparedStatement ps = conn.prepareStatement("INSERT INTO PERSON VALUES(?,?,?,?,?,?)");	
		
		ps.setInt(1, id);
		ps.setString(2, fname);
		ps.setString(3, lname);
		ps.setString(4, gender);
		ps.setInt(5, age);
		ps.setInt(6, edu_id);
		
		ps.executeUpdate();
		System.out.println(id+" "+"updated");
		
	
		ps.close();
		conn.close();
			
	}

	public static void testDelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
		int id=5;
		
		PreparedStatement ps = conn.prepareStatement("DELETE FROM PERSON WHERE ID= ?");	
		ps.setInt(1, id);
		ps.executeUpdate();
		System.out.println(id+" "+"deleted");
		
	
		ps.close();
		conn.close();
		
	}

	public static void testSelect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
		PreparedStatement ps = conn.prepareStatement("SELECT* FROM PERSON");	
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println("\t"+rs.getString(2));
			System.out.println("\t"+rs.getString(3));
			System.out.println("\t"+rs.getString(4));
		}
		ps.close();
		conn.close();		
	}


}
