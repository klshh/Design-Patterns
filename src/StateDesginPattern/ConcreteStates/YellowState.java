package StateDesginPattern.ConcreteStates;

import StateDesginPattern.ITrafficLightState;
import StateDesginPattern.TrafficLightColor;
import StateDesginPattern.TrafficLightContext;

public class YellowState implements ITrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Light Switching From Yellow to Red!!");
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return TrafficLightColor.YELLOW.name();
    }
}
