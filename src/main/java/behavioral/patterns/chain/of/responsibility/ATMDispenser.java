package behavioral.patterns.chain.of.responsibility;

public class ATMDispenser {
    public static void main(String[] args) {
        CashDispenser dispenser2000 = new Rupees2000Dispenser();
        CashDispenser dispenser500 = new Rupees500Dispenser();
        CashDispenser dispenser200 = new Rupees200Dispenser();
        CashDispenser dispenser100 = new Rupees100Dispenser();

        dispenser2000.setNext(dispenser500);
        dispenser500.setNext(dispenser200);
        dispenser200.setNext(dispenser100);

        System.out.println("Withdraw ₹3700:");
        dispenser2000.dispense(3700);

        System.out.println("\nWithdraw ₹2900:");
        dispenser2000.dispense(2900);

        System.out.println("\nWithdraw ₹3750:");
        dispenser2000.dispense(3750);
    }
}
