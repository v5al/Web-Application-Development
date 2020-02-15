/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dpapp_full;

import java.sql.*;

/**
 *
 * @author vi5a7
 */
public class student {
    private String name = "";
    private String city = "";
    Connection con = null;
    Statement st = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    public void getStatement() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit_new","root","");
        st = con.createStatement();
    }
    
    public void insertRecord(student obj) throws SQLException{
        st.execute("insert into student values('"+obj.name+"','"+obj.city+"')");
    }
}
