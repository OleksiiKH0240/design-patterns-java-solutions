import Builders.Car;
import Builders.CarBuilder;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = new Singleton();

        Director director = s1.getInstance();
        Car car = director.buildSedan("blue");
        System.out.println(car);
        System.out.println("\n------------------------------------------");

        Director director2 = s1.getInstance();
        Car car2 = director2.buildPickup("red");
        System.out.println(car2);
        System.out.println("\n------------------------------------------");

        Director director3 = s1.getInstance();
        Car car3 = director3.buildSedan("gray");
        System.out.println(car3);
        System.out.println("\n------------------------------------------");

        Director director4 = s1.getInstance();
        Car car4 = director4.buildSedan("white");
        System.out.println(car4);
    }
}
