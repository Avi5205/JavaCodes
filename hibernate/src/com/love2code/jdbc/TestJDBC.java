package com.love2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTime=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";

		try {
			System.out.println("Connecting to DB..." + jdbcUrl);

			Connection myCon = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Connected");

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
