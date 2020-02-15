package templatepattern;

import java.util.Scanner;
public class TemplatePattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let order the food:");
        System.out.print("Meat ball: ");
        boolean meatBall = scan.nextBoolean();
        System.out.print("Papaya Salad: ");
        boolean papayaSalad = scan.nextBoolean();
        System.out.print("Vigor: ");
        boolean vigor = scan.nextBoolean();
        System.out.print("Jinro: ");
        boolean jinro = scan.nextBoolean();
        
        OrderList fd = new Food();
        fd.order(meatBall, papayaSalad, false, false);
        
        OrderList dr = new Drink();
        dr.order(false, false, vigor, jinro);
        
    }
}
