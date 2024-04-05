package CarComponents;

public enum BodyType {
    SEDAN, HATCHBACK, SUV, PICKUP;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
