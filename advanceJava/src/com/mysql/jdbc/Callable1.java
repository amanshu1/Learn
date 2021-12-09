package com.mysql.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.sql.CallableStatement;

public class Callable1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech","root","root");
		
		CallableStatement cal = conn.prepareCall("{call emp_count(?)}");
		cal.registerOutParameter(1, Types.INTEGER);
		cal.execute();
		
		System.out.println("employe count: "+cal.getInt(1));
		
		cal.close();
		conn.close();
	}
}
