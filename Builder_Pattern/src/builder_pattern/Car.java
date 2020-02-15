package builder_pattern;
public class Car {
    String color = "";
    String engineType = "";
    String brand = "";

    //to make the object printable
    @Override
    public String toString() {
         return "COLOR:"+ color + ",BRAND:" + brand + ",ENGINE:" + engineType;
    }
    
    Car(String color, String engineType, String brand){
        this.color = color;
        this.engineType = engineType;
        this.brand = brand;
    }
    public static class CarBuilder{
        String color;
        String engineType;
        String brand;
        public CarBuilder  setColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder setEngine(String engineType){
            this.engineType = engineType;
            return this;
        }
        public CarBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        
        public Car build(){
            Car car = new Car(this.color,this.engineType,this.brand);
            return car;
        }
    }
}
