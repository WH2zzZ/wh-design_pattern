package com.wanghan.design.strategy.behavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Oh! I'm flying");
    }
}
