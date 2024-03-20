package Builders;

import CarComponents.Transmission;
import CarComponents.TransmissionType;

public class TransmissionBuilder {
    private int numberOfGears;
    private TransmissionType transmissionType;

    public TransmissionBuilder setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
        return this;
    }

    public TransmissionBuilder setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
        return this;
    }

    public Transmission build() {
        return new Transmission(numberOfGears, transmissionType);
    }
}
