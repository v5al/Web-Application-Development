
package factorydesignpattern;

import java.util.Scanner;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        String carName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the car you want:");
        carName = scanner.next();
        Car car = CarFactory.getCar(carName);
        car.printInfo();
    }
}
