package behavioral.patterns.strategydesignpattern.strategy;

public class InsertionSort implements SortingStrategy{
    @Override
    public void sort() {
        System.out.println("Insertion sort....");
    }
}
