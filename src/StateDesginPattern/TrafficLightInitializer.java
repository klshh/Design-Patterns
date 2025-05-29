package StateDesginPattern;

public class TrafficLightInitializer {
    public static void startTrafficLight(){
        TrafficLightContext context = new TrafficLightContext();
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
