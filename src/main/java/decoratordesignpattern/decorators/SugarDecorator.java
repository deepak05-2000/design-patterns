package decoratordesignpattern.decorators;

import decoratordesignpattern.Coffee;

public class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Sugar Added";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.0;
    }
}
