package com.WorkBook;

import java.sql.*;
import java.util.*;

public class JTC12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		CallableStatement cs = null;

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
			cs = con.prepareCall("insert students(?,?,?,?)");
			cs.setInt(1, id);
			cs.setString(2, name);
			cs.setString(3, email);
			cs.setString(4, phone);
			cs.execute();
			System.out.println("Record inserted succesfully");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JdbcUtil.cleanUp(st, con);
		}

	}

}
