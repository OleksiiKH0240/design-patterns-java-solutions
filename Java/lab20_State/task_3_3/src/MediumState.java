public class MediumState implements FanState {
    private final Fan fan;

    public MediumState(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void turnUp() {
        fan.setState(new HighState(fan));
        System.out.println("Fan is on high");
    }

    @Override
    public void turnDown() {
        fan.setState(new LowState(fan));
        System.out.println("Fan is on low");
    }
}