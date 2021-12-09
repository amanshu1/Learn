package com.java.adweb.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationModal {
	public static Integer nextPK() throws SQLException {
		Connection conn = null;
		int pk = 0;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech", "root", "root");

			PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM REGISTRATION");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				pk = rs.getInt(1);
			}
			rs.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return pk + 1;
	}

	public void add(RegistrationBean bean) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech", "root", "root");

		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("INSERT INTO REGISTRATION VALUES(?,?,?,?,?,?,?,?)");

		ps.setInt(1, nextPK());
		ps.setString(2, bean.getFirstName());
		ps.setString(3, bean.getLastName());
		ps.setString(4, bean.getEmail());
		ps.setString(5, bean.getPassword());
		ps.setString(6, bean.getGender());
		ps.setString(7, bean.getUsername());
		ps.setString(8, bean.getDOB());

		ps.executeUpdate();
		conn.commit();
		System.out.println("added");

		ps.close();
		conn.close();
	}

	public RegistrationBean authenticate(String email, String password) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech", "root", "root");
		RegistrationBean bean = null;
		PreparedStatement ps = conn.prepareStatement("select * from registration where email=? and password=?");

		ps.setString(1, email);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		System.out.println("1");
		
		while (rs.next()) {
			System.out.println("2");
			bean = new RegistrationBean();	
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setGender(rs.getString(6));
			bean.setUsername(rs.getString(7));
			bean.setDOB(rs.getString(8));
		}System.out.println("3");
		System.out.println("found user");
		return bean;
	}
	public RegistrationBean ForgotPassword(String email) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sunraystech", "root", "root");
		RegistrationBean bean = null;
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM REGISTRATION WHERE EMAIL=?");

		ps.setString(1, email);
		ResultSet rs = ps.executeQuery();
		System.out.println("1");
		while (rs.next()) {
			System.out.println("2");
			bean = new RegistrationBean();
			bean.setFirstName(rs.getString(2));
			bean.setLastName(rs.getString(3));
			bean.setEmail(rs.getString(4));
			bean.setPassword(rs.getString(5));
			bean.setGender(rs.getString(6));
			bean.setUsername(rs.getString(7));
			bean.setDOB(rs.getString(8));
		}System.out.println("3");
		return bean;
	}
}