import Builders.Car;
import Builders.CarBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilder());

        Car car = director.buildSedan("blue");
        System.out.println(car);
        System.out.println("\n------------------------------------------");

        Car car2 = director.buildPickup("red");
        System.out.println(car2);
        System.out.println("\n------------------------------------------");

        Car car3 = car.clone();
        System.out.println(car3);
        System.out.println("\n------------------------------------------");

        Car car4 = car2.clone();
        System.out.println(car4);
    }
}
