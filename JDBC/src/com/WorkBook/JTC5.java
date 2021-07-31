package com.WorkBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JTC5 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JdbcUtil.getOracleConnection();
			String query = "select * from students";
			st = con.createStatement();
			rs = st.executeQuery(query);
			if (rs.next()) {
				do {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);

					System.out.println(id + "\t" + name + "\t" + email + "\t" + phone);
				} while (rs.next());
			} else {
				System.out.println("Record Not Inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(rs, st, con);
		}
	}
}
