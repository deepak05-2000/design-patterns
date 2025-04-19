package creational.patterns.factory;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike Starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopping...");
    }
}
