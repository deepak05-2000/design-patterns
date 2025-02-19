package builderdesignpattern;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder("Large")
                .mushrooms(true)
                .cheese(true)
                .pepperoni(false)
                .build();
    }
}
