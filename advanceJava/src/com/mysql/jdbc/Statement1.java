package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Statement1 {
	public static void main(String[] args) throws Exception {
		testSelect();
		//testInsert();
		//testDelete();	
	}

	public static void testSelect() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("SELECT * FROM PERSON");
		
		System.out.println("id/fname/lname/age");
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.print("\t"+rs.getString(2));
			System.out.print("\t"+rs.getString(3));
			System.out.print("\t"+rs.getString(4));
		}
		stmt.close();
		conn.close();
		
		
	}

	public static void testDelete() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
		Statement stmt = conn.createStatement();
		
		int j= stmt.executeUpdate("DELETE FROM PERSON WHERE ID=3;");
		System.out.println(j+"DELETED");
		stmt.close();
		conn.close();
		
		
	}

	public static void testInsert() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
		Statement stmt = conn.createStatement();
		
		int i= stmt.executeUpdate("INSERT INTO PERSON VALUES(3,'ANUSHKA','THAKUR','FEMALE',23,1)");
		System.out.println(i+"inserted");
		stmt.close();
		conn.close();
	}
	
	

}
