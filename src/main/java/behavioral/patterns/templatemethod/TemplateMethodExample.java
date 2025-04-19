package behavioral.patterns.templatemethod;

public class TemplateMethodExample {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        csvParser.parseData();
        System.out.println();
        DataParser jsonParser = new JSONParser();
        jsonParser.parseData();
    }
}
