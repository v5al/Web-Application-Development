/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batchupdatesprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

/**
 *
 * @author vi5a7
 */
public class BatchUpdatesProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
           
            PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
            System.out.println("Enter total number of records:");
            num = scanner.nextInt();
            
            for(int i=0;i<num;i++){
                System.out.println("Enter id and sname:");
                String id = scanner.next();
                String name = scanner.next();
                ps.setString(1, id);
                ps.setString(2,name);
                ps.addBatch();
            }
            
            ps.executeBatch();
            
        }catch(Exception e){
            
        }
    }
    
}
