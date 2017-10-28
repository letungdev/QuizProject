package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TMK_PLAN4
 */
public class ConnectionManager {
    
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String user = "sa";
            String password = "123456";
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLTTNSON", user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
     public static void main (String [] agrs){
        System.out.println(ConnectionManager.getConnection());
    }
 
}
