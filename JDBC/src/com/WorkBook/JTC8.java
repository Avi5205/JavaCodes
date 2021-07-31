package com.WorkBook;

import java.sql.*;
import java.util.*;

public class JTC8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JdbcUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Query");
			String query = sc.nextLine();
			st = con.createStatement();
			boolean b1 = st.execute(query);
			if (b1) {
				rs = st.getResultSet();
				if (rs.next()) {
					do {
						int id = rs.getInt(1);
						String name = rs.getString(2);
						String email = rs.getString(3);
						String phone = rs.getString(4);
						System.out.println(id + "\t" + name + "\t" + email + "\t" + phone);
					} while (rs.next());
				} else {
					int x = st.executeUpdate(query);
					System.out.println("Result:" + x);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(rs, st, con);
		}
	}
}
