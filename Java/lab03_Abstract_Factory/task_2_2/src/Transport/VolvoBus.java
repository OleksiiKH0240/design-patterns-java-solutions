package Transport;

public class VolvoBus implements Bus {
    private final int purchaseCost;
    private final int operationalCost;
    private final int passengerCapacity;

    public VolvoBus() {
        this.purchaseCost = 6000000;
        this.operationalCost = 20;
        this.passengerCapacity = 50;
    }

    public VolvoBus(int purchaseCost, int operationalCost, int passengerCapacity) {
        this.purchaseCost = purchaseCost;
        this.operationalCost = operationalCost;
        this.passengerCapacity = passengerCapacity;
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
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public String toString() {
        return "VolvoBus{" +
                "purchaseCost=" + purchaseCost +
                ", operationalCost=" + operationalCost +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
