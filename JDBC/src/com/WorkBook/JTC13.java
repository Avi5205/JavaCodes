package com.WorkBook;

import java.sql.*;
import java.util.Scanner;

public class JTC13 {
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

            cs = con.prepareCall("call updateinfo(?,?,?,?)");
            cs.setInt(1, id);
//            cs.setString(2,name);
            cs.setString(3, email);
//            cs.setString(4,phone);

            cs.registerOutParameter(2, Types.VARCHAR);
            cs.registerOutParameter(3, Types.VARCHAR);
            cs.execute();

            String nm = cs.getString(name + "\t" + email + "\t" + phone);
            System.out.println("called Successfully");
            System.out.println("Record inserted successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.cleanUp(st, con);
        }
    }
}
