
package com.javavcube.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ClassnotfoundExceptions {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        System.out.println("main method started");

        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver class loaded into your primary location");

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/student",
                "root",
                "root"
        );

        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM emp";

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            
                System.out.println("***************************");
            System.out.print(rs.getInt(1) + " |");
            System.out.print(rs.getString(2) + " |");
            System.out.print(rs.getString(3) + " |");
            System.out.print(rs.getString(4) + " |");
        }

        
    }
}

