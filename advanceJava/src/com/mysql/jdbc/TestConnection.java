package com.mysql.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;

public class TestConnection {

	public static void main(String[] args) throws Exception {
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
}