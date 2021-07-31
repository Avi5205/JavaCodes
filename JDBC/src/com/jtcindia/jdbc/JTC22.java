package com.jtcindia.jdbc;

import com.WorkBook.JdbcUtil;
import com.sun.rowset.JdbcRowSetImpl;

import javax.sql.RowSet;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;

public class JTC22 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            RowSet rs = new JdbcRowSetImpl();
            rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
            rs.setUsername("system");
            rs.setPassword("root");

           //Connection con = JdbcUtil.getOracleConnection();
//            RowSet rs = new JdbcRowSetImpl();
            rs.setCommand("select sid,sname,email,phone from jtcstudents");
            rs.execute();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
            rs.absolute(2);
            rs.updateString(2, "Somprakash");
            rs.updateString(3, "Somprakash@jtc.com");
            rs.updateRow();
            System.out.println("Updated");
            rs.beforeFirst();
            System.out.println("Serializing JdbcRowSet");
            FileOutputStream fos = new FileOutputStream("E:\\rowset.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(rs);
            System.out.println("Serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
