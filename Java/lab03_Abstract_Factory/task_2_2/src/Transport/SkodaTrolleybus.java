package Transport;

public class SkodaTrolleybus implements Trolleybus {
    private final int purchaseCost;
    private final int operationalCost;
    private final double voltage;

    public SkodaTrolleybus() {
        this.purchaseCost = 6800000;
        this.operationalCost = 12;
        this.voltage = 750;
    }

    public SkodaTrolleybus(int purchaseCost, int operationalCost, double voltage) {
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
        return "SkodaTrolleybus{" +
                "purchaseCost=" + purchaseCost +
                ", operationalCost=" + operationalCost +
                ", voltage=" + voltage +
                '}';
    }
}