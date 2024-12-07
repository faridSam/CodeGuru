package DesignPatterns.Behavioural.FactoryMethod.Logistics;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
