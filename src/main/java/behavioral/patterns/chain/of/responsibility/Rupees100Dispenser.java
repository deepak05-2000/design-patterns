package behavioral.patterns.chain.of.responsibility;

public class Rupees100Dispenser extends CashDispenser{
    @Override
    protected void handleDispense(int amount) {
        int hundredNotes = amount / 100;
        int remainder = amount % 100;
        if(hundredNotes > 0) {
            System.out.println("Dispensing " + hundredNotes + " * 100");
        }
        if(remainder > 0) {
            System.out.println("Cannot dispense remaining " + remainder);
        }
    }
}
