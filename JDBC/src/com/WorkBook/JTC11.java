package com.WorkBook;

import java.sql.*;
import java.util.*;

public class JTC11 {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
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
			System.out.println("Enter Query");
			String query = sc.nextLine();
			ps = con.prepareStatement(query);
			boolean b1 = ps.execute();
			if (b1) {
				ResultSet rs = ps.getResultSet();
				if (rs.next()) {
					do {
						int id1 = rs.getInt(1);
						String name1 = rs.getString(2);
						String email1 = rs.getString(3);
						String phone1 = rs.getString(4);

						System.out.println(id1 + "\t" + name1 + "\t" + email1 + "\t" + phone1);
					} while (rs.next());
				}
			} else {
				int x1 = ps.getUpdateCount();
				System.out.println("Result:" + x1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(st, con);
		}

	}

}
