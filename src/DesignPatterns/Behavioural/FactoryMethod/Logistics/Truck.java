package DesignPatterns.Behavioural.FactoryMethod.Logistics;

public class Truck implements Transport{
    public Truck() {
        this.deliver();
    }
    @Override
    public void deliver() {
        System.out.println("Delivered by Truck");
    }
}
