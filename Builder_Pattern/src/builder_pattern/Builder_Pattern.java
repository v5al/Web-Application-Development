package builder_pattern;
public class Builder_Pattern {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().setEngine("Oil Cooled").setColor("Red").setBrand("Audi").build();
        System.out.println(car);
    }
}
