package behavioral.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer> collection = new MyCollection<>();
        for(int i = 1; i <= 10; i++) {
            collection.add(i);
        }
        Iterator<Integer> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
