package behavioral.patterns.chain.of.responsibility;

public class Rupees2000Dispenser extends CashDispenser{
    @Override
    protected void handleDispense(int amount) {
        int twoThousandNotes = amount / 2000;
        int remainder = amount % 2000;
        if(twoThousandNotes > 0) {
            System.out.println("Dispensing " + twoThousandNotes + " * 2000");
        }
        if(remainder > 0 && nextDispenser != null) {
            nextDispenser.dispense(remainder);
        }
    }
}
