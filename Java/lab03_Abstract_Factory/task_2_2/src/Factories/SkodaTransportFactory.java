package Factories;

import Transport.*;

public class SkodaTransportFactory implements TransportFactory {
    @Override
    public Trolleybus createTrolleybus() {
        return new SkodaTrolleybus();
    }

    @Override
    public Trolleybus createTrolleybus(int purchaseCost, int operationalCost, double voltage) {
        return new SkodaTrolleybus(purchaseCost, operationalCost, voltage);
    }

    @Override
    public Bus createBus() {
        return new SkodaBus();
    }

    @Override
    public Bus createBus(int purchaseCost, int operationalCost, int passengerCapacity) {
        return new SkodaBus(purchaseCost, operationalCost, passengerCapacity);
    }

    @Override
    public Tram createTram() {
        return new SkodaTram();
    }

    @Override
    public Tram createTram(int purchaseCost, int operationalCost, int passengerCapacity) {
        return new SkodaTram(purchaseCost, operationalCost, passengerCapacity);
    }
}
