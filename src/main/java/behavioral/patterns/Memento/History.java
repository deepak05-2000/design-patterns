package behavioral.patterns.Memento;

import java.util.Stack;

public class History {
    private Stack<Memento> mementos = new Stack<>();

    public void save(Memento memento) {
        mementos.push(memento);
    }
    public Memento undo() {
        if(!mementos.empty()) {
            return mementos.pop();
        }
        return new Memento("");
    }
}
