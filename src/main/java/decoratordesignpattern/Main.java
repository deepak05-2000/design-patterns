package decoratordesignpattern;

import decoratordesignpattern.decorators.MilkDecorator;
import decoratordesignpattern.decorators.SugarDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BaseCoffee();
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " Cost: " + coffee.getCost());
    }
}
