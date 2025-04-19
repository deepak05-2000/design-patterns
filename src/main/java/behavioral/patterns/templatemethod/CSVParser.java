package behavioral.patterns.templatemethod;

public  class CSVParser extends DataParser {
    @Override
    protected void readData() {
        System.out.println("Reading CSV file...");
    }

    @Override
    protected void processData() {
        System.out.println("Processing CSV data");
    }
}
