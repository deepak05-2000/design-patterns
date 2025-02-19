package behavioral.patterns.observerdesignpattern.observable;

import behavioral.patterns.observerdesignpattern.Observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    float getTemperature();
}
