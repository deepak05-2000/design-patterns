package behavioral.patterns.observerdesignpattern.observable;

import behavioral.patterns.observerdesignpattern.Observer;

import java.util.*;

public class WeatherStation implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
