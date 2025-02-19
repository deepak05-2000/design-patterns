package adapterdesignpattern;

public class VoltageAdapter implements Socket {
    private USASocket usaSocket;
    VoltageAdapter(USASocket usaSocket) {
        this.usaSocket = usaSocket;
    }
    @Override
    public Integer getVoltage() {
        return usaSocket.supplyVoltage() * 2;
    }
}
