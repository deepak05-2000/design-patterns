package behavioral.patterns.strategydesignpattern.strategy;

public class BubbleSort implements SortingStrategy{
    @Override
    public void sort() {
        System.out.println("Bubble Sort....");
    }
}
