public class CarBuilder {
    private final FlyweightEngineFactory engineFactory = new FlyweightEngineFactory();
    private final FlyweightWheelFactory wheelFactory = new FlyweightWheelFactory();

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheel(Wheel wheel) {
        this.wheel = wheel;
        return this;
    }

    private Car.Type type;
    private Car.CarColor carColor;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder reset() {
        type = Car.Type.Sedan;
        carColor = Car.CarColor.White;
        engine = engineFactory.getEngine(105, Engine.Fuel.Petrol);
        wheel = wheelFactory.getWheel(17, Wheel.Material.Steel);
        return this;
    }

    public CarBuilder() {
        reset();
    }

    public Car build() {

        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException();
        }

        return new Car(type, carColor, engine, wheel);
    }

}
