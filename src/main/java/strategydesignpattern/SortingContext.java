package strategydesignpattern;

import strategydesignpattern.strategy.SortingStrategy;

public class SortingContext {
    SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }


    public void sort(int[] array) {
        sortingStrategy.sort();
    }

}
