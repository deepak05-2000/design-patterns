package behavioral.patterns.templatemethod;

public class JSONParser extends DataParser{
    @Override
    protected void readData() {
        System.out.println("Reading JSON data...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing JSON data...");
    }
}
