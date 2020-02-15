package readspecificrecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadSpecificRecord {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        Statement st = con.createStatement();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of student that you want to see: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for(int i=1 ; i<=num ; i++){
           System.out.print("Enter the id of "+i+" student: ");
           arr[i-1] = scanner.nextInt();
        }
        for(int i:arr){
            ResultSet rs = st.executeQuery("select * from b6b where id = '"+i+"'");
            rs.next();
            System.out.println("Id: "+rs.getString("id")+": Name: "+rs.getString("sname"));
        }
    }
    
}
