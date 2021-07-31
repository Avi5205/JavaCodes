package com.WorkBook;

import java.sql.*;
import java.util.*;

public class JTC10 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		CallableStatement cs = null;
		PreparedStatement ps = null;

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

			String query = String.format("select * from students");
			ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				int id1 = rs.getInt(1);
				String name1 = rs.getString(2);
				String email1 = rs.getString(3);
				String phone1 = rs.getString(4);

				System.out.println(id1 + "\t" + name1 + "\t" + email1 + "\t" + phone1);
			} else {
				System.out.println("Sorry, Student not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(st, con);
		}
	}
}
