package Transport;

public class SkodaBus implements Bus{
    private final int purchaseCost;
    private final int operationalCost;
    private final int passengerCapacity;

    public SkodaBus() {
        this.purchaseCost = 4500000;
        this.operationalCost = 25;
        this.passengerCapacity = 50;
    }

    public SkodaBus(int purchaseCost, int operationalCost, int passengerCapacity) {
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
        return "SkodaBus{" +
                "purchaseCost=" + purchaseCost +
                ", operationalCost=" + operationalCost +
                ", passengerCapacity=" + passengerCapacity +
                '}';
    }
}
