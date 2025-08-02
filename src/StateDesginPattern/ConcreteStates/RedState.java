package StateDesginPattern.ConcreteStates;

import StateDesginPattern.ITrafficLightState;
import StateDesginPattern.TrafficLightColor;
import StateDesginPattern.TrafficLightContext;

public class RedState implements ITrafficLightState {
    @Override
    public void next(TrafficLightContext context) {
        System.out.println("Light Switching From Red to Green!!");
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return TrafficLightColor.RED.name();
    }
}
