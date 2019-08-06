package com.wanghan.design.strategy;

import com.wanghan.design.strategy.behavior.FlyBehavior;

public class Duck {
    private FlyBehavior flyBehavior;

    public void fly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
