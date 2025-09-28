package behavioral.patterns.state;

public interface TrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
