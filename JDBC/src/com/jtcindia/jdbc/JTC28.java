package com.jtcindia.jdbc;

import com.WorkBook.JdbcUtil;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JTC28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name with path");
        String filename = sc.nextLine();
        String abcfilename = filename;
        StringTokenizer tok = new StringTokenizer(filename, "\\");
        while (tok.hasMoreTokens())
            filename = tok.nextToken();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        FileInputStream fis = null;
        try {
            con = JdbcUtil.getOracleConnection();
            String sql = "insert into datatable(name,data) values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, filename);
            File image = new File(abcfilename);
            fis = new FileInputStream(image);
            ps.setBinaryStream(2, fis, (int) image.length());
            ps.execute();
            System.out.println("inserted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
