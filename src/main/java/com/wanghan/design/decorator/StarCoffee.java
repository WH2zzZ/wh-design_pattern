package com.wanghan.design.decorator;

import com.wanghan.design.decorator.component.Beverage;
import com.wanghan.design.decorator.component.Espresso;
import com.wanghan.design.decorator.decorate.Mocha;

/**
 * test class
 *
 * @Author WangHan
 * @Create 2019-08-11 18:54
 */
public class StarCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + beverage.cost());

        beverage = Mocha.decorator(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());

        beverage = Mocha.decorator(beverage);
        System.out.println(beverage.getDescription() + beverage.cost());

    }
}
