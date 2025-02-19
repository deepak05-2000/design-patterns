package structural.patterns.decoratordesignpattern.decorators;

import structural.patterns.decoratordesignpattern.Coffee;

public class MilkDecorator implements Coffee {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " Milk Added";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20.0;
    }
}
