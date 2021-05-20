package com.wanghan.design.strategy;

import com.wanghan.design.strategy.behavior.fly.FlyNoWay;
import com.wanghan.design.strategy.behavior.fly.FlyWithWings;
import com.wanghan.design.strategy.behavior.quack.NormalQuack;
import com.wanghan.design.strategy.behavior.quack.Squack;

/**
 * strategy pattern :
 *      封装变化
 *      复合优于继承
 *      针对接口编程,不针对实现编程
 *
 * 含义：针对一个实体对象的行为做抽象
 *
 * 举例：比如鸭子的行为分 "飞" 和 "叫"，下面的案例就是针对这个鸭子的这两个行为进行抽象，
 * 通过多态的特性保证了鸭子的行为在变化的时候能够快速应对变化
 *
 * @Author WangHan
 * @Date 23:51 2019/6/16
 * @Param
 * @return
 */
public class Test {

    public static void main(String[] args) {

        RubberDuck rubberDuck = new RubberDuck(new FlyNoWay(), new NormalQuack());

        rubberDuck.fly();
        rubberDuck.setFlyBehavior(new FlyWithWings());
        rubberDuck.fly();

        rubberDuck.quack();
        rubberDuck.setQuackStrategy(new Squack());
        rubberDuck.quack();
    }
}
