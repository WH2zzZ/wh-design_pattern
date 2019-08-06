package com.wanghan.design.strategy;

import com.wanghan.design.strategy.behavior.FlyBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehavior flyBehavior) {
        setFlyBehavior(flyBehavior);
    }
}
