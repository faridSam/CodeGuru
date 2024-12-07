import DesignPatterns.Behavioural.FactoryMethod.Logistics.*;
import Idioms.SimpleFactory.Gadgets.PhoneFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();
        factory.makePhone("Iphone");
        factory.makePhone("Samsung");

        Logistics logistics = new RoadLogistics();
        logistics.createTransport();

    }
}