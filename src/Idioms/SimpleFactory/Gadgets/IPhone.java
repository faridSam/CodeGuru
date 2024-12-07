package Idioms.SimpleFactory.Gadgets;

public class IPhone implements Phone {
    public IPhone() {
        this.createPhone();
    }
    @Override
    public void createPhone() {
        System.out.println("Creating IPhone ...");
    }
}
