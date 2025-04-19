package creational.patterns.factory;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType) {
        if (vehicleType.equals("Car")) {
            return new Car();
        } else if (vehicleType.equals("Bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
