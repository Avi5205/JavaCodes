package com.WorkBook;

import java.sql.*;

public class JTC1 {
	static {
		Connection con = null;
		Statement st = null;

		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:JTCORADSN", "system", "root");
			String sql = "insert into jtcstudents values(99,'som','som@jtc.com','123345567'";
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if (x == 1) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record Not Inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
