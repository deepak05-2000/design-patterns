package behavioral.patterns.iterator;

import java.util.List;
import java.util.NoSuchElementException;

public class MyIterator<T> implements Iterator<T> {

    private List<T> collection;
    private int index = 0;

    public MyIterator(List<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.size();
    }

    @Override
    public T next() {
        if(!hasNext()) {
            throw new IndexOutOfBoundsException();
        } else {
            return collection.get(index++);
        }
    }
}
