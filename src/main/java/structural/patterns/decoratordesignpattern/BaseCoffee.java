package structural.patterns.decoratordesignpattern;

 class BaseCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Base Coffee";
    }

    @Override
    public double getCost() {
        return 50.0;
    }
}
