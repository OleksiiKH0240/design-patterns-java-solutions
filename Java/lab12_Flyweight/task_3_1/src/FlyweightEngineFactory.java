import java.util.HashMap;
import java.util.Map;

public class FlyweightEngineFactory {
    private final Map<String, Engine> engines = new HashMap<>();

    public FlyweightEngineFactory() {
    }

    public Engine getEngine(int power, Engine.Fuel fuelType) {
        String key = power + "_" + fuelType;
        Engine engine = this.engines.get(key);

        if (engine == null) {
            this.engines.put(key, engine = new Engine(power, fuelType));
            return engine;
        }
        return engine;
    }
}
