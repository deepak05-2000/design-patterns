package behavioral.patterns.observerdesignpattern;

import behavioral.patterns.observerdesignpattern.observable.Subject;

public class Desktop implements Observer{
    private final String deviceName;
    private final Subject observable;

    public Desktop(String deviceName, Subject observable) {
        this.deviceName = deviceName;
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("Desktop" + deviceName + " received update Temp = " + observable.getTemperature());
    }
}
