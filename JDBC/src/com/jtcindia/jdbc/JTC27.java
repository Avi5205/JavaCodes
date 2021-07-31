package com.jtcindia.jdbc;

import com.WorkBook.JdbcUtil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JTC27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ID");
        int id=sc.nextInt();
        System.out.println("Enter Date");
        int d=sc.nextInt();
        System.out.println("Enter Month");
        int m=sc.nextInt();
        System.out.println("Enter Year");
        int y=sc.nextInt();
        Date dt=new Date(y-1900,m-1,d) ;
        Connection con=null;
        Statement st=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            con = JdbcUtil.getOracleConnection();
            DatabaseMetaData md=con.getMetaData();
            ps=con.prepareStatement("insert into datetest values(?,?)");
            ps.setInt(1,id);
            ps.setInt(2, d);
            ps.executeUpdate();
            System.out.println("inserted");
            JdbcUtil.cleanUp(ps, null);

            ps=con.prepareStatement("select * from datetest");
            rs=ps.executeQuery();
            while(rs.next()){
                Date dob=rs.getDate(2);
                SimpleDateFormat f=new SimpleDateFormat("dd-mm-yyyy");
                System.out.println(id+"\t"+d);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
