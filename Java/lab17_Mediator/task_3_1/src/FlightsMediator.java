import java.util.HashMap;

public class FlightsMediator implements Mediator {
    private final HashMap<Integer, Plane> planes;
    private final PlanesInFlight planesInFlight;
    private final PlanesOnGround planesOnGround;
    private final Runway runway;

    public FlightsMediator() {
        planes = new HashMap<>();
        planesInFlight = new PlanesInFlight();
        planesOnGround = new PlanesOnGround();
        runway = new Runway();
    }

    @Override
    public void notify(String event, int planeId) {
        if (event.equals("take_off")) {
            takeOff(planeId);
        } else if (event.equals("land")) {
            land(planeId);
        } else {
            throw new IllegalArgumentException("event '" + event + "' is not supported.");
        }
    }

    public void addPlane(Plane plane) {
        planes.put(plane.getId(), plane);
        planesOnGround.addPlane(plane);
    }

    private void takeOff(int planeId) {
        Plane plane = planes.get(planeId);

        if (!plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + planeId + " is taking off...");
            planesOnGround.removePlane(plane);
            planesInFlight.addPlane(plane);
            plane.setIsInTheAir(true);
            runway.setIsAvailable(false);
        }
    }

    private void land(int planeId) {
        Plane plane = planes.get(planeId);
        if (plane.getIsInTheAir() && runway.getIsAvailable()) {
            System.out.println("Plane " + planeId + " is landing...");
            planesInFlight.removePlane(plane);
            planesOnGround.addPlane(plane);
            plane.setIsInTheAir(false);
            runway.setIsAvailable(false);
        }
    }
}
