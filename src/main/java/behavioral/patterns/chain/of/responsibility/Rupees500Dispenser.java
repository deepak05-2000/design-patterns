package behavioral.patterns.chain.of.responsibility;

public class Rupees500Dispenser extends CashDispenser{
    @Override
    protected void handleDispense(int amount) {
        int fiveHundredNotes = amount / 500;
        int remainder = amount % 500;
        if(fiveHundredNotes > 0) {
            System.out.println("Dispensing " + fiveHundredNotes + " * 500");
        }
        if(remainder > 0 && nextDispenser != null) {
            nextDispenser.dispense(remainder);
        }
    }
}
