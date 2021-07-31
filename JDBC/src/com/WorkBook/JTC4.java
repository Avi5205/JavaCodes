package com.WorkBook;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class JTC4 {

	public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = JdbcUtil.getOracleConnection();
            String query = "insert into students values(101,'Avinash','akgpcamp@gmail.com','9334096480')";
//            String query = "DROP TABLE student";
            st = con.createStatement();
            int x = st.executeUpdate(query);

            if (x == 1) {
                System.out.println("Record inserted");
            } else {
                System.out.println("Try Again...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.cleanUp(st, con);
            JdbcUtil.cleanUp(rs, st, con);
        }
    }
}
