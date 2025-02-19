package adapterdesignpattern;

public class Main {
    public static void main(String[] args) {
        USASocket usaSocket = new USASocket();
        Socket indianSocket = new VoltageAdapter(usaSocket);

        IndianDevice indianDevice = new IndianDevice(indianSocket);
        indianDevice.charge();

    }
}
