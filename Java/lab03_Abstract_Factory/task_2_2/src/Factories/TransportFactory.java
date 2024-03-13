package Factories;

import Transport.*;

public interface TransportFactory {
    Trolleybus createTrolleybus();
    Trolleybus createTrolleybus(int purchaseCost, int operationalCost, double voltage);
    Bus createBus();
    Bus createBus(int purchaseCost, int operationalCost, int passengerCapacity);
    Tram createTram();
    Tram createTram(int purchaseCost, int operationalCost, int passengerCapacity);
}