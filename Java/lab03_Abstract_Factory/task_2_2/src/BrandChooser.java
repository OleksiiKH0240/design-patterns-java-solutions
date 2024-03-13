import Factories.*;
import Transport.Transport;

public class BrandChooser {

    public Transport[] createTransports(TransportFactory factory, int numberBuses, int numberTrolleybuses, int numberTrams) {
        Transport[] transports = new Transport[numberBuses + numberTrolleybuses + numberTrams];
        int i = 0;
        for (; i < numberBuses; i++) {
            transports[i] = factory.createBus();
        }
        for (; i < numberBuses + numberTrolleybuses; i++) {
            transports[i] = factory.createTrolleybus();
        }
        for (; i < numberBuses + numberTrolleybuses + numberTrams; i++) {
            transports[i] = factory.createTram();
        }
        return transports;
    }

    public int calculateOverallCost(Transport[] transports, int N) {
        int overallCost = 0;
        for (Transport transport : transports) {
            overallCost += transport.getPurchaseCost() + transport.calculateDistanceCost(N * 1000);
        }
        return overallCost;
    }
}
