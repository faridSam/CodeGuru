package Idioms.SimpleFactory.Gadgets;

public class PhoneFactory {
    public Phone makePhone(String phoType){
        Phone phone = null;
        if (phoType.equalsIgnoreCase("iphone")){
            phone = new IPhone();
        }else if (phoType.equalsIgnoreCase("samsung")){
            phone = new Samsung();
        }
        return phone;
    }
}
