package Builders;

import CarComponents.*;

public class Car implements Prototype {
    private final BodyType bodyType;
    private final WheelDisk wheelDisk;
    private final Transmission transmission;
    private final Rubber rubber;
    private final Engine engine;
    private final String color;

    public Car(BodyType bodyType, WheelDisk wheelDisk, Transmission transmission, Rubber rubber, Engine engine, String color) {
        this.bodyType = bodyType;
        this.wheelDisk = wheelDisk;
        this.transmission = transmission;
        this.rubber = rubber;
        this.engine = engine;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Builders.Car{" +
                "bodyType=" + bodyType +
                ", wheelDisk=" + wheelDisk +
                ", transmission=" + transmission +
                ", rubber=" + rubber +
                ", engine=" + engine +
                ", color='" + color + "'" +
                '}';
    }

    @Override
    public Car clone() {
        return new Car(this.bodyType, this.wheelDisk, this.transmission, this.rubber, this.engine, this.color);
    }
}
