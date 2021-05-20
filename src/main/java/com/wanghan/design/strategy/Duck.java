package com.wanghan.design.strategy;

import com.wanghan.design.strategy.behavior.FlyStrategy;
import com.wanghan.design.strategy.behavior.QuackStrategy;

public class Duck {

    private FlyStrategy flyStrategy;

    private QuackStrategy quackStrategy;

    public void fly(){
        flyStrategy.fly();
    }

    public void quack(){
        quackStrategy.quack();
    }

    public void setFlyBehavior(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }
}
