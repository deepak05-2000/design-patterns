package behavioral.patterns.chain.of.responsibility;

public class Rupees200Dispenser extends CashDispenser{
    @Override
    protected void handleDispense(int amount) {
        int twoHundredNotes = amount / 200;
        int remainder = amount % 200;
        if(twoHundredNotes > 0) {
            System.out.println("Dispensing " + twoHundredNotes + " * 200");
        }
        if(remainder > 0 && nextDispenser != null) {
            nextDispenser.dispense(remainder);
        }
    }
}
