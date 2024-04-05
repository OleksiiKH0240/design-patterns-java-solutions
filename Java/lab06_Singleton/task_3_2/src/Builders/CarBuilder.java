package Builders;

import CarComponents.*;

public class CarBuilder implements Builder{
    private BodyType bodyType;
    private WheelDisk wheelDisk;
    private Transmission transmission;
    private Rubber rubber;
    private Engine engine;
    private String color;

    @Override
    public Builder setBodyType(BodyType bodyType) {
        System.out.println("Set body type to: " + bodyType);
        this.bodyType = bodyType;
        return this;
    }

    @Override
    public Builder setTransmission(Transmission transmission) {
        System.out.println("Set transmission to: " + transmission);
        this.transmission = transmission;
        return this;
    }

    @Override
    public Builder setWheelDisk(WheelDisk wheelDisk) {
        System.out.println("Set wheel disk to: " + wheelDisk);
        this.wheelDisk = wheelDisk;
        return this;
    }

    @Override
    public Builder setRubber(Rubber rubber) {
        System.out.println("Set rubber to: " + rubber);
        this.rubber = rubber;
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        System.out.println("Set engine to: " + engine);
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setColor(String color) {
        System.out.println("Set color to: " + color);
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(bodyType, wheelDisk, transmission, rubber, engine, color);
    }
}
