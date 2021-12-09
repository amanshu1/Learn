package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransHandling {
	public static void main(String[] args) throws Exception {
		
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/taste","root","root");
	
	conn.setAutoCommit(false);
	
	Statement stmt = conn.createStatement();
	
	int i= stmt.executeUpdate("INSERT INTO PERSON VALUES(6,'ANVI','SEN','FEMALE',33,1)");
	i = stmt.executeUpdate("INSERT INTO PERSON VALUES(6,'ANVI','SEN','FEMALE',33,1)");
	
	conn.commit();
	
	System.out.println(i+"inserted");
	stmt.close();
	conn.close();
	}
}
