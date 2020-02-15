
package dpapp_full;

import java.util.Scanner;

public class DPApp_Full {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "";
        String city = "";
        Scanner scanner = new Scanner(System.in);
        student obj = new student();
        System.out.println("Enter name and city:");
        obj.setCity(scanner.next());
        obj.setName(scanner.next());
        try{
            obj.getStatement();
            obj.insertRecord(obj);
            System.out.println("Successfully Insert :)");
        }catch(Exception e){
            
        }
    }
    
}
