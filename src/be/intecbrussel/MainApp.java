package be.intecbrussel;

public class MainApp {
    public static void main(String[]args){
        LightBulb bulb=new LightBulb();
        bulb.turnOn();
        bulb.turnOff();
        //opdracht maak een class phone die de interface Switch implementeert
        Phone phone=new Phone();
        phone.turnOn();
        phone.turnOff();
    }
}
