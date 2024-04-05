package CarComponents;

public enum RubberType {
    SILICONE, SYNTHETIC, NATURAL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
