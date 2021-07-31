package com.WorkBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JTC9 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JdbcUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String name = sc.nextLine();
			System.out.println("Enter Email");
			String email = sc.nextLine();
			System.out.println("Enter Phone");
			String phone = sc.nextLine();

			String query = String.format("insert into students values(?,?,?,?)");
			System.out.println(query);
			ps = con.prepareStatement(query);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setString(4, phone);

			int x = ps.executeUpdate();

			if (x == 1) {
				System.out.println("Record inserted successfully");
			} else {
				System.out.println("not inserted");
			}
			String query1 = sc.nextLine();
			ps = con.prepareStatement(query1);
			boolean b1 = ps.execute();
			if (b1) {
				rs = ps.getResultSet();
				if (rs.next()) {
					do {
						int id1 = rs.getInt(1);
						String name1 = rs.getString(2);
						String email1 = rs.getString(3);
						String phone1 = rs.getString(4);
						System.out.println(id1 + "\t" + name1 + "\t" + email1 + "\t" + phone1);
					} while (rs.next());
				} else {
					int x1 = ps.getUpdateCount();
					System.out.println("Result:" + x1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(rs, st, con);
		}

	}
}
