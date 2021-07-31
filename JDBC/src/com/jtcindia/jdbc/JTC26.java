package com.jtcindia.jdbc;

import com.WorkBook.JdbcUtil;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JTC26 {
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
        Date dt=new Date(y-1900,m-1,d);
        Connection con=null;
        Statement st=null;
        try {
            con = JdbcUtil.getOracleConnection();
            DatabaseMetaData md=con.getMetaData();
            String db=md.getDatabaseProductName();
            String dob="";
            System.out.println(db);
            if(db.equals("Oracle")){
                SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
                dob=f.format(dt);
            }
            st=con.createStatement();
            String sql=String.format("insert into datetest values(%d,'%s')",d,dob);
            st.executeUpdate(sql);
            System.out.println("Inserted");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
