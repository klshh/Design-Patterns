package StateDesginPattern.ConcreteStates;

import StateDesginPattern.ITrafficLightState;
import StateDesginPattern.TrafficLightColor;
import StateDesginPattern.TrafficLightContext;

public class GreenState implements ITrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Light Switching From Green to Yellow!!");
        context.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return TrafficLightColor.GREEN.name();
    }
}
