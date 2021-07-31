package com.WorkBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JTC6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JdbcUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Email");
			String email = sc.nextLine();
			System.out.println("Enter Phone");
			String phone = sc.nextLine();

			String query = String.format("insert into students values(%d,'%s','%s','%s')", id, name, email, phone);
			System.out.println(query);
			st = con.createStatement();
			int x = st.executeUpdate(query);

			if (x == 1) {
				System.out.println("Record inserted successfully");
			} else {
				System.out.println("Not inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(rs, st, con);
		}
	}
}
