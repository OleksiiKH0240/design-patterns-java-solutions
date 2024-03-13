package Transport;

public class VolvoTrolleybus implements Trolleybus {
    private final int purchaseCost;
    private final int operationalCost;
    private final double voltage;

    public VolvoTrolleybus() {
        this.purchaseCost = 7000000;
        this.operationalCost = 13;
        this.voltage = 750;
    }

    public VolvoTrolleybus(int purchaseCost, int operationalCost, double voltage) {
        this.purchaseCost = purchaseCost;
        this.operationalCost = operationalCost;
        this.voltage = voltage;
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
    public double getVoltage() {
        return voltage;
    }

    @Override
    public int calculateDistanceCost(int distance) {
        return distance * operationalCost;
    }

    @Override
    public String toString() {
        return "VolvoTrolleybus{" +
                "purchaseCost=" + purchaseCost +
                ", operationalCost=" + operationalCost +
                ", voltage=" + voltage +
                '}';
    }
}
