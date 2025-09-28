package behavioral.patterns.state;

public class StatePatternExample {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();
        System.out.println(context.getColor());
        context.next();
        System.out.println(context.getColor());
        context.next();
        System.out.println(context.getColor());
    }
}
