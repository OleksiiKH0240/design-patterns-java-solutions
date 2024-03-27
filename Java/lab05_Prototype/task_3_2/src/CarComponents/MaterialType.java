package CarComponents;

public enum MaterialType {
    ALUMINIUM, STEEL, CARBON;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
