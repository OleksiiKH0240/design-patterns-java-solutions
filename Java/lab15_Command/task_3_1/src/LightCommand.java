public class LightCommand implements Command {
    private final Lamp lamp;

    LightCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void on() {
        this.lamp.lightOn();
    }

    @Override
    public void off() {
        this.lamp.lightOff();
    }
}
