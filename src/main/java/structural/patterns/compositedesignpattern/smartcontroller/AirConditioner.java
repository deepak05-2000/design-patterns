package structural.patterns.compositedesignpattern.smartcontroller;

public class AirConditioner implements SmartComponent {
    @Override
    public void turnOn() {
        System.out.println("Air conditioner turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioner turned off");
    }
}
