package behavioral.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<T> implements IterableCollection<T> {

    private List<T> items = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(items);
    }

    public void add(T item) {
        items.add(item);
    }
    public void remove(T item) {
        items.remove(item);
    }
}
