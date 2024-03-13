package Transport;

public interface Transport {
    int getPurchaseCost();
    int getOperationalCost();
    int calculateDistanceCost(int distance);
}
