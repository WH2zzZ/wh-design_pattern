package com.wanghan.design.decorator.decorate;

import com.wanghan.design.decorator.component.Beverage;

/**
 * 摩卡
 *
 * @Author WangHan
 * @Create 2019-08-11 18:47
 */
public class Mocha implements CondimentDecorator {

    Beverage beverage;

    private Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public static Mocha decorator(Beverage beverage){
        return new Mocha(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }
}
