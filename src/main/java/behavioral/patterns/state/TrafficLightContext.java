package behavioral.patterns.state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext() {
        currentState = new RedLightState();
    }
    public void next() {
        currentState.next(this);
    }
    public void setCurrentState(TrafficLightState state) {
        currentState = state;
    }
    public String getColor() {
        return currentState.getColor();
    }


}
