/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbapp_user_insertion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vi5a7
 */
public class DBApp_User_Insertion {
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/new_kit";
        String user = "root";
        String pass = ""; 
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(dbURL,user,pass);
            Statement st = con.createStatement();
             Scanner input = new Scanner(System.in);
            ArrayList<new_kit> list = new ArrayList();
            System.out.println("Numbers of Data to Insert:");
            int loop = input.nextInt();
            for(int i=1; i <= loop ; i++){
                new_kit collection = new new_kit();
                System.out.println("Data #"+i);
                System.out.println("Name:");
                collection.setName(input.next());
                System.out.println("Age:");
                collection.setAge(input.next());
                list.add(collection);             
            }
            // Insert into Database (forEach), enhance for loop
            for(new_kit Obj:list){
                String command = "INSERT INTO student(sname,age) VALUES('"+Obj.getName()+"','"+Obj.getAge()+"')";
                st.execute(command);
            }
        }catch(Exception e){
            
        }
    }
}
