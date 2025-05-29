package StateDesginPattern;

public interface ITrafficLightState {
    void next(TrafficLightContext context);
    String getColor();
}
