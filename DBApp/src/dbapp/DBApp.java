/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vi5a7
 */
//
public class DBApp {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/kit";
        String user = "root";
        String pass = "";
        String insertQuery = "insert into b6b(sname,city) values (\"ABC\",\"PP\")"; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbURL,user,pass);
            Statement st = con.createStatement();
            st.execute(insertQuery);
        }catch(Exception e){
            
        }
    }
    
}
