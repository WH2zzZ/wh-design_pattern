package strategy;

import strategy.behavior.FlyBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehavior flyBehavior) {
        setFlyBehavior(flyBehavior);
    }
}
