package readallrecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadAllRecords {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        Statement st = con.createStatement();
        Scanner scanner = new Scanner(System.in);
        ResultSet rs = st.executeQuery("select * from b6b");
        while(rs.next()){
            System.out.println("Id: "+rs.getString("id")+": Name: "+rs.getString("sname"));        
        }
    }
}
