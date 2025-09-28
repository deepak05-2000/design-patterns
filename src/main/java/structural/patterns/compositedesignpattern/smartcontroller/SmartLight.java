package structural.patterns.compositedesignpattern.smartcontroller;

public class SmartLight implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Light turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turning off...");
    }
}
