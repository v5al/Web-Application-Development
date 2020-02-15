/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

/**
 *
 * @author vi5a7
 */
public class PreparedStatementProgram {
    public static void main(String[] args) throws Exception {
        b6b obj = new b6b();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id and city:");
        String id = scanner.next();
        String city = scanner.next();
        obj.setId(id);
        obj.setCity(city);
        PreparedStatementProgram pp = new PreparedStatementProgram();
        pp.insertRecord(obj);
    }
    public void insertRecord(b6b obj)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
        PreparedStatement ps = con.prepareStatement("insert into b6b values(?,?)");
        ps.setString(1,obj.getId());
        ps.setString(2,obj.getCity());
        ps.execute();
    }
}
