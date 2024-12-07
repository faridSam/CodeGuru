package DesignPatterns.Behavioural.FactoryMethod.Logistics;

public class SeaLoagistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Boat();
    }
}
