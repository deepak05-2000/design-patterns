package observerdesignpattern.observer;

import observerdesignpattern.observable.Subject;

public class Mobile implements Observer{
    private final String deviceName;
    private final Subject observable;

    public Mobile(String deviceName, Subject observable) {
        this.deviceName = deviceName;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Mobile" + deviceName + " received update Temp = " + observable.getTemperature());
    }
}
