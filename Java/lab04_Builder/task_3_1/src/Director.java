import Builders.*;
import CarComponents.*;


public class Director {
    private final Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car buildSedan(String color) {
        System.out.println("Sedan is building.");

        Transmission sedanTransmission = new TransmissionBuilder()
                .setNumberOfGears(6)
                .setTransmissionType(TransmissionType.AUTOMATIC)
                .build();

        Engine sedanEngine = new EngineBuilder()
                .setFuelType(FuelType.DIESEL)
                .setPower(100)
                .setTorque(200)
                .setVolume(4.0)
                .build();

        WheelDisk sedanWheelDisk = new WheelDiskBuilder()
                .setDiameter(15)
                .setMaterialType(MaterialType.CARBON)
                .setWidth(7)
                .build();

        Rubber sedanRubber = new RubberBuilder()
                .setRubberType(RubberType.NATURAL)
                .setElasticity(0.8)
                .setHardness(60)
                .build();

        Car car = builder
                .setBodyType(BodyType.SEDAN)
                .setTransmission(sedanTransmission).
                setEngine(sedanEngine).
                setWheelDisk(sedanWheelDisk).
                setRubber(sedanRubber).
                setColor(color)
                .build();

        System.out.println("Sedan was built.");

        return car;
    }

    public Car buildPickup(String color) {
        System.out.println("Pickup is building.");

        Transmission pickupTransmission = new TransmissionBuilder()
                .setNumberOfGears(5)
                .setTransmissionType(TransmissionType.MANUAL)
                .build();

        Engine pickupEngine = new EngineBuilder()
                .setFuelType(FuelType.PETROL)
                .setPower(350)
                .setTorque(300)
                .setVolume(5.0)
                .build();

        WheelDisk pickupWheelDisk = new WheelDiskBuilder()
                .setDiameter(16)
                .setMaterialType(MaterialType.CARBON)
                .setWidth(10)
                .build();

        Rubber pickupRubber = new RubberBuilder()
                .setRubberType(RubberType.SILICONE)
                .setElasticity(0.3)
                .setHardness(70)
                .build();

        Car car = builder
                .setBodyType(BodyType.PICKUP)
                .setTransmission(pickupTransmission).
                setEngine(pickupEngine).
                setWheelDisk(pickupWheelDisk).
                setRubber(pickupRubber).
                setColor(color)
                .build();

        System.out.println("Pickup was built.");

        return car;
    }
}