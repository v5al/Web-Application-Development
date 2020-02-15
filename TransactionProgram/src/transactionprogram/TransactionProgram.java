/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transactionprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author vi5a7
 */
public class TransactionProgram {
    Statement st;
    Connection con;
    public static void main(String[] args) throws Exception {
       new TransactionProgram().transact();
    }
    public void transact() throws Exception{
        int debitId = 0;
        int creditId = 0;
        int amount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id to debit:");
        debitId = scanner.nextInt();
        System.out.println("Enter amount to transfer:");
        amount = scanner.nextInt();
        System.out.println("Enter id to credit:");
        creditId = scanner.nextInt();
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking", "root", "");
            con.setAutoCommit(false);
            st = con.createStatement();
            st.execute("update bank set balance = balance -'"+amount+"' where id = '"+debitId+"'");
            st.execute("update bank set balance = balance +'"+amount+"' where id = '"+creditId+"'");
            con.commit();
            System.out.println("Success ... Thank for using our service !!");
    }
}
