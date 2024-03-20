import Builders.Car;
import Builders.CarBuilderDetailed;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new CarBuilderDetailed());

        Car car = director.buildSedan("blue");
        System.out.println(car);
        System.out.println("\n------------------------------------------");

        Car car2 = director.buildPickup("red");
        System.out.println(car2);
        System.out.println("\n------------------------------------------");

        Car car3 = director.buildSedan("gray");
        System.out.println(car3);
        System.out.println("\n------------------------------------------");

        Car car4 = director.buildSedan("white");
        System.out.println(car4);
    }
}
