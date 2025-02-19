package adapterdesignpattern;

public class IndianDevice {
    private Socket socket;

    public IndianDevice(Socket socket) {
        this.socket = socket;
    }
    public void charge() {
        int voltage = socket.getVoltage();
        if (voltage == 220) {
            System.out.println("Charging... Voltage is " + voltage + "V");
        } else {
            System.out.println("Cannot charge! Incorrect voltage: " + voltage + "V");
        }
    }
}
