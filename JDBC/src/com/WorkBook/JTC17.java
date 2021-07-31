package com.WorkBook;

import java.sql.*;

public class JTC17 {
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JdbcUtil.getOracleConnection();
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from students");
			System.out.println("**Forward Direction**");
			while (rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			System.out.println("**Reverse Direction**");
			while (rs.previous()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			System.out.println("1st record");
			rs.first();
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			System.out.println("**4th Record * * ");
			rs.absolute(4);
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			System.out.println("**From 4th next 2ndRecord * * ");
			rs.relative(2);
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.cleanUp(rs, st, con);
		}
	}
}
