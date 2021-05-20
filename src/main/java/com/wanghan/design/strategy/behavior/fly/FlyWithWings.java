package com.wanghan.design.strategy.behavior.fly;

import com.wanghan.design.strategy.behavior.FlyStrategy;

public class FlyWithWings implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("Oh! I'm flying");
    }
}
