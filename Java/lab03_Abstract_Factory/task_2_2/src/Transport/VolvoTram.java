package Transport;

public class VolvoTram implements Tram{
    private final int purchaseCost;
    private final int operationalCost;
    private final double trackWidth;

    public VolvoTram() {
        this.purchaseCost = 10000000;
        this.operationalCost = 7;
        this.trackWidth = 1.435;
    }

    public VolvoTram(int purchaseCost, int operationalCost, double trackWidth) {
        this.purchaseCost = purchaseCost;
        this.operationalCost = operationalCost;
        this.trackWidth = trackWidth;
    }

    @Override
    public int getPurchaseCost() {
        return purchaseCost;
    }

    @Override
    public int getOperationalCost() {
        return operationalCost;
    }

    @Override
    public int calculateDistanceCost(int distance) {
        return distance * operationalCost;
    }

    @Override
    public double getTrackWidth() {
        return trackWidth;
    }

    @Override
    public String toString() {
        return "VolvoTram{" +
                "purchaseCost=" + purchaseCost +
                ", operationalCost=" + operationalCost +
                ", trackWidth=" + trackWidth +
                '}';
    }
}