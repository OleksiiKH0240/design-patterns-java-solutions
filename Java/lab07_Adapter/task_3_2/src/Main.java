import com.vehiclecalculator.CarCalculator;
import com.vehiclecalculator.Vehicle;
import com.vehiclecalculator.VehicleCalculator;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(5, "Audi", 0.2f, 100_000);
        VehicleCalculator calculator = new CarCalculator();
        calculator.setVehicle(vehicle);
        System.out.println(calculator.calculatePrice());

        System.out.println("---------------------");
        Auto auto = new Auto(5, "Audi", true, 100_000);
        Adapter adapter = new Adapter();

        float vehiclePrice = adapter.vehiclePrice(auto);
        float vehicleTax = adapter.tax(auto);

        System.out.println("Auto price: " + vehiclePrice + " UAH");
        System.out.println("Auto tax: " + vehicleTax + " UAH");
        System.out.println("Auto overall price: " + (vehiclePrice + vehicleTax) + " UAH");
    }


}
