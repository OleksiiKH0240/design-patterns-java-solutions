public class HighState implements FanState {
    private final Fan fan;

    public HighState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnUp() {
        System.out.println("Fan is already on high");
    }

    @Override
    public void turnDown() {
        fan.setState(new MediumState(fan));
        System.out.println("Fan is on medium");
    }
}