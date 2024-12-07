package Idioms.SimpleFactory.Gadgets;

public class Samsung implements Phone {

    public Samsung() {
        this.createPhone();
    }

    @Override
    public void createPhone() {
        System.out.println("Creating Samsung Phone...");
    }
}
