package CarComponents;

public enum TransmissionType {
    MANUAL, AUTOMATIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
