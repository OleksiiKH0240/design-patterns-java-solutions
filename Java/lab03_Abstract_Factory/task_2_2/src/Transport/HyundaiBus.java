package Transport;

public class HyundaiBus implements Bus{
    private final int purchaseCost;
    private final int operationalCost;
    private final int passengerCapacity;

    public HyundaiBus() {
        this.purchaseCost = 5500000;
        this.operationalCost = 20;
        this.passengerCapacity = 50;
    }

    public HyundaiBus(int purchaseCost, int operationalCost, int passengerCapacity) {
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
        return "HyundaiBus{" +
                "purchaseCost=" + purchaseCost +
                ", operationalCost=" + operationalCost +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
