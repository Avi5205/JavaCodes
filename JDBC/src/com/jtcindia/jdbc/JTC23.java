package com.jtcindia.jdbc;

import com.sun.rowset.CachedRowSetImpl;

import javax.sql.RowSet;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class JTC23 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            RowSet rs = new CachedRowSetImpl();
            rs.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
            rs.setUsername("system");
            rs.setPassword("root");
            System.out.println("1");
            rs.setCommand("select id,name,email,phone from jtcstudents");

            rs.execute();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
            System.out.println("2");
//            System.out.println("\n--Reverse Order--");
//            while (rs.previous()) {
//                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
//            }
            System.out.println("--absolute(3)--");
            rs.absolute(3);

            System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            rs.updateString(2, "Som");
            rs.updateString(3, "som@jtc.org");
            rs.updateRow();
            System.out.println("--Updated--");
            System.out.println("--Serializing the CachedRowSetImpl--");
            FileOutputStream fos = new FileOutputStream("E:\\rowset.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(rs);
            System.out.println("Object Serialized");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
