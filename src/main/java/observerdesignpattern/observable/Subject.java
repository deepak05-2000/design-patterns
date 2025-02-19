package observerdesignpattern.observable;

import observerdesignpattern.observer.Observer;

public interface Subject {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    float getTemperature();
}
