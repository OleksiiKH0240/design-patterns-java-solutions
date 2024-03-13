import Factories.HyundaiTransportFactory;
import Factories.SkodaTransportFactory;
import Factories.TransportFactory;
import Factories.VolvoTransportFactory;
import Transport.Transport;


public class Main {
    public static void main(String[] args) {
        int numberBuses = 15;
        int numberTrolleybuses = 10;
        int numberTrams = 5;
        int N = 1000;
        int hyundaiOverallCost;
        int skodaOverallCost;
        int volvoOverallCost;

        TransportFactory hyundaiFactory = new HyundaiTransportFactory();
        TransportFactory skodaFactory = new SkodaTransportFactory();
        TransportFactory volvoFactory = new VolvoTransportFactory();

        Transport[] transports;

        BrandChooser brandChooser = new BrandChooser();

        transports = brandChooser.createTransports(skodaFactory, numberBuses, numberTrolleybuses, numberTrams);
        skodaOverallCost = brandChooser.calculateOverallCost(transports, N);

        transports = brandChooser.createTransports(volvoFactory, numberBuses, numberTrolleybuses, numberTrams);
        volvoOverallCost = brandChooser.calculateOverallCost(transports, N);

        System.out.println("Skoda overall cost: " + skodaOverallCost);
        System.out.println("Volvo overall cost: " + volvoOverallCost);

        if (skodaOverallCost < volvoOverallCost) {
            System.out.println("Skoda is better");
        } else if (skodaOverallCost > volvoOverallCost) {
            System.out.println("Volvo is better");
        } else {
            System.out.println("Skoda and Volvo are equal");
        }

        transports = brandChooser.createTransports(hyundaiFactory, numberBuses, numberTrolleybuses, numberTrams);
        hyundaiOverallCost = brandChooser.calculateOverallCost(transports, N);

        System.out.println("Hyundai overall cost: " + hyundaiOverallCost);

        if (hyundaiOverallCost < skodaOverallCost) {
            if (hyundaiOverallCost < volvoOverallCost) {
                System.out.println("Hyundai is better");
            } else if (hyundaiOverallCost > volvoOverallCost) {
                System.out.println("Volvo is better");
            } else {
                System.out.println("Hyundai and Volvo are equal");
            }
        } else if (hyundaiOverallCost > skodaOverallCost) {
            if (skodaOverallCost < volvoOverallCost) {
                System.out.println("Skoda is better");
            } else if (skodaOverallCost > volvoOverallCost) {
                System.out.println("Volvo is better");
            } else {
                System.out.println("Skoda and Volvo are equal");
            }
        } else {
            if (hyundaiOverallCost < volvoOverallCost) {
                System.out.println("Hyundai and Skoda are equal");
            } else if (hyundaiOverallCost > volvoOverallCost) {
                System.out.println("Volvo is better");
            } else {
                System.out.println("Hyundai, Skoda and Volvo are equal");
            }
        }
    }
}
