package com.jtcindia.jdbc;

import com.WorkBook.JdbcUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JTC29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file Name");
        String filename = sc.nextLine();
        Connection con = null;
        PreparedStatement ps = null;
        FileOutputStream fos = null;

        try {
            con = JdbcUtil.getOracleConnection();
            String sql = "select name,data from database where name=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, filename);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                File image = new File("E:\\" + filename);
                fos = new FileOutputStream(image);
                byte[] buffer = new byte[1];
                InputStream is = rs.getBinaryStream(2);
                while (is.read(buffer) > 0) {
                    fos.write(buffer);
                }
            }
            System.out.println("file Accessed in E:\\" + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
