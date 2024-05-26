public class Main {

    public static void main(String[] args) {
        Mediator flightsMediator = new FlightsMediator();

        Plane plane = new Plane(123, flightsMediator);
        plane.takeOff();
    }

}
