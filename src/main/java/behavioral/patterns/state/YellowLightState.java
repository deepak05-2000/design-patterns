package behavioral.patterns.state;

public class YellowLightState implements TrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Going to RED state");
        context.setCurrentState(new RedLightState());
    }

    @Override
    public String getColor() {
        return "YELLOW";
    }
}
