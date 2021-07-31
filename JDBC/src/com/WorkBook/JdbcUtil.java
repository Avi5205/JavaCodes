package com.WorkBook;

import java.sql.*;


public class JdbcUtil {
	public static Connection getOracleConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		Connection con = DriverManager.getConnection(url, "system", "root");
		return con;
	}

	public static Connection getMySQLConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/jdbc";
		Connection con = DriverManager.getConnection(url, "root", "root");
		return con;
	}

	public static void cleanUp(Statement st, Connection con) {
		try {
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void cleanUp(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (st != null) {
				st.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
