package com.jtcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.InsufficientResourcesException;

import com.WorkBook.JdbcUtil;
import jdk.nashorn.internal.runtime.ECMAException;
import org.omg.CORBA.ExceptionList;

public class Account {
    int bal;
    int xbal, ybal, zbal;

    public void transfer(int x, int y, int z) {
        Connection con = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try {
            con = JdbcUtil.getOracleConnection();

            //START TRANSACTION
            con.setAutoCommit(false);

            //OPERATION 1: CHECK DESTINATION ACCOUNT
            ps1 = con.prepareStatement("select bal from account where accno=?");
            ResultSet rs1 = ps1.executeQuery();
            if (rs1.next()) {
                xbal = rs1.getInt(1);
            } else {
                throw new InvalidAccountNumberException(x);
            }
            x = y + z;

            //OPERATION 2: UPDATE DESTINATION ACCOUNT
            ps2 = con.prepareStatement("update account set bal=? where accno=?");
            ps2.setInt(1, x);
            ps2.setInt(2, y);
            ps2.executeUpdate();
            System.out.println("***" + x + "update");

            //OPERATION 3: CHECK SOURCE ACCOUNT
            ps1.setInt(1, y);
            rs1 = ps1.executeQuery();

            if (rs1.next()) {
                y = rs1.getInt(1);
            } else {
                throw new InvalidAccountNumberException(x);
            }
            if (ybal >= z) {
                ybal = ybal = z;
            } else {
                throw new InvalidAccountNumberException();
            }

            //OPERATION 4: UPDATE SOURCE ACCOUNT
            ps2.setInt(1, ybal);
            ps2.setInt(2, x);
            ps2.executeUpdate();
            con.commit();
            System.out.println("**" + x + "update");
            System.out.println("**Fund Transfered");

        } catch (Exception e) {
            try {
                con.rollback();
            } catch (Exception e1) {
                System.out.println(e);
            }
        }
    }
}
