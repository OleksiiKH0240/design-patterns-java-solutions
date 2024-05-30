public class LowState implements FanState {
    private final Fan fan;

    public LowState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnUp() {
        fan.setState(new MediumState(fan));
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnDown() {
        System.out.println("Fan is already on low");
    }
}