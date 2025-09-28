package behavioral.patterns.state;

public class RedLightState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Going to GREEN state");
        context.setCurrentState(new GreenLightState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
