package creational.patterns.factory;

public class FactoryMethodExample {
    public static void main(String[] args) {
//        Vehicle car = new Car();
//        Vehicle bike = new Bike();
        // Client needs to know how object is created if logic changes then code needs to be changed here

        // So lets delegate object creation to factory which handles it

        Vehicle car = VehicleFactory.createVehicle("Car");
        Vehicle bike = VehicleFactory.createVehicle("Bike");

        car.start();
        car.stop();


    }
}
