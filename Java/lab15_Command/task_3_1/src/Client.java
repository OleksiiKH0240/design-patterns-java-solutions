public class Client {
    public static void main(String[] args) {

        Lamp kitchenLamp = new Lamp("Kitchen");
        Lamp hallLamp = new Lamp("Hall");
        Lamp bedroomLamp = new Lamp("Bedroom");
        Lamp bathroomLamp = new Lamp("Bathroom");

        Command controllerKitchenLamp = new LightCommand(kitchenLamp);
        Command controllerHallLamp = new LightCommand(hallLamp);
        Command controllerBedroomLamp = new LightCommand(bedroomLamp);
        Command controllerBathroomLamp = new LightCommand(bathroomLamp);
        Command controllerUniversal = new UniversalCommand(
                controllerKitchenLamp,
                controllerHallLamp,
                controllerBedroomLamp,
                controllerBathroomLamp
        );

        // Simulation
        controllerKitchenLamp.on();
        controllerHallLamp.on();
        controllerBedroomLamp.on();

        controllerKitchenLamp.off();
        controllerHallLamp.off();
        controllerBedroomLamp.off();

        controllerBedroomLamp.on();
        controllerBathroomLamp.on();

        controllerUniversal.off();

    }
}
