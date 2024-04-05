package CarComponents;

public class Transmission {
    private final int GearsCount;
    private final TransmissionType transmissionType;

    public Transmission(int GearsCount, TransmissionType transmissionType) {
        this.GearsCount = GearsCount;
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "GearsCount=" + GearsCount +
                "; transmissionType=" + transmissionType +
                '}';
    }
}
