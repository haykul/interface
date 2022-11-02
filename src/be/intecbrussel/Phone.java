package be.intecbrussel;

public class Phone implements Switch{

    @Override
    public void turnOn() {
        System.out.println("phone is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("phone is turned off");

    }
}
