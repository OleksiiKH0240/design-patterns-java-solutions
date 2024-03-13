package Factories;

import Transport.*;

public class HyundaiTransportFactory implements TransportFactory {
    @Override
    public Trolleybus createTrolleybus() {
        return new HyundaiTrolleybus();
    }

    @Override
    public Trolleybus createTrolleybus(int purchaseCost, int operationalCost, double voltage) {
        return new HyundaiTrolleybus(purchaseCost, operationalCost, voltage);
    }

    @Override
    public Bus createBus() {
        return new HyundaiBus();
    }

    @Override
    public Bus createBus(int purchaseCost, int operationalCost, int passengerCapacity) {
        return new HyundaiBus(purchaseCost, operationalCost, passengerCapacity);
    }

    @Override
    public Tram createTram() {
        return new HyundaiTram();
    }

    @Override
    public Tram createTram(int purchaseCost, int operationalCost, int passengerCapacity) {
        return new HyundaiTram(purchaseCost, operationalCost, passengerCapacity);
    }
}
