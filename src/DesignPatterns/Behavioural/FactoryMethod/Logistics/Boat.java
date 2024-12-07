package DesignPatterns.Behavioural.FactoryMethod.Logistics;

public class Boat implements Transport{
    public Boat() {
        this.deliver();
    }
    @Override
    public void deliver(){
        System.out.println("Delivered by Boat");
    }
}
