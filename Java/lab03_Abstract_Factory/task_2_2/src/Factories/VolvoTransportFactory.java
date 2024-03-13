package Factories;

import Transport.*;

public class VolvoTransportFactory implements TransportFactory {
    @Override
    public Trolleybus createTrolleybus() {
        return new VolvoTrolleybus();
    }

    @Override
    public Trolleybus createTrolleybus(int purchaseCost, int operationalCost, double voltage) {
        return new VolvoTrolleybus(purchaseCost, operationalCost, voltage);
    }

    @Override
    public Bus createBus() {
        return new VolvoBus();
    }

    @Override
    public Bus createBus(int purchaseCost, int operationalCost, int passengerCapacity) {
        return new VolvoBus(purchaseCost, operationalCost, passengerCapacity);
    }

    @Override
    public Tram createTram() {
        return new VolvoTram();
    }

    @Override
    public Tram createTram(int purchaseCost, int operationalCost, int passengerCapacity) {
        return new VolvoTram(purchaseCost, operationalCost, passengerCapacity);
    }
}
