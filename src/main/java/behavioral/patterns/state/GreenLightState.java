package behavioral.patterns.state;

public class GreenLightState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Going to YELLOW state");
        context.setCurrentState(new YellowLightState());
    }

    @Override
    public String getColor() {
        return "GREEN";
    }
}
