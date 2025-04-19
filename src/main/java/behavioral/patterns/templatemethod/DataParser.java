package behavioral.patterns.templatemethod;

public abstract class DataParser {
    public final void parseData() {
        readData();
        processData();
        writeData();
    }
    protected abstract void readData();
    protected abstract void processData();

    protected void writeData() {
        // common functionality
        System.out.println("Writing data to the output...");
    }
}
