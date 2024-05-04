import java.util.HashMap;
import java.util.Map;

public class FlyweightWheelFactory {
    private final Map<String, Wheel> wheels = new HashMap<>();

    public FlyweightWheelFactory() {
    }

    public Wheel getWheel(int diameter, Wheel.Material material) {
        String key = diameter + "_" + material;
        Wheel wheel = this.wheels.get(key);

        if (wheel == null) {
            this.wheels.put(key, wheel = new Wheel(diameter, material));
            return wheel;
        }
        return wheel;
    }
}
