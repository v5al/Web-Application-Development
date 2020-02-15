import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class ReadRecord {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kit","root","");
        Statement st = con.createStatement();
        System.out.print("Enter the id of student: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        ResultSet rs = st.executeQuery("select * from b6b where id = '"+id+"'");
        rs.next();
        System.out.println("Id: "+rs.getString("id")+": Name: "+rs.getString("sname"));
    }
}
