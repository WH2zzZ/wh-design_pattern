package com.wanghan.design.strategy;

import com.wanghan.design.strategy.behavior.FlyStrategy;
import com.wanghan.design.strategy.behavior.QuackStrategy;

public class RubberDuck extends Duck {

    public RubberDuck(FlyStrategy flyStrategy,
                      QuackStrategy quackStrategy) {
        setFlyBehavior(flyStrategy);
        setQuackStrategy(quackStrategy);
    }
}
