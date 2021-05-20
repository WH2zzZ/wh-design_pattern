package com.wanghan.design.strategy.behavior.fly;

import com.wanghan.design.strategy.behavior.FlyStrategy;

public class FlyNoWay implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
