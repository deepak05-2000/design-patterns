package behavioral.patterns.chain.of.responsibility;

public abstract class CashDispenser {
    protected CashDispenser nextDispenser;
    public void setNext(CashDispenser nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    public void dispense(int amount) {
        if (amount > 0) {
            handleDispense(amount);
        }
    }

    protected abstract void handleDispense(int amount);
}
