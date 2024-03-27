package CarComponents;

public enum FuelType {
    PETROL, DIESEL, ELECTRIC;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
