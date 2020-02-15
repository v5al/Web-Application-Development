
package factorydesignpattern;

public class CarFactory {
    public static Car getCar(String carName){
        if(carName.equals("audi")){
            return new AudiCar();
        }
        else if(carName.equals("tesla")){
            return new TeslaCar();
        }
        else if(carName.equals("bmw")){
            return new BMWCar();
        }
        else{
            return null;
        }
    }
}
