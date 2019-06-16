package strategy;

import strategy.behavior.FlyNoWay;

/**
 * strategy pattern :
 *      封装变化
 *      复合优于继承
 *      争对接口编程,不针对实现编程
 * @Author WangHan
 * @Date 23:51 2019/6/16
 * @Param
 * @return
 */
public class Test {

    public static void main(String[] args) {

        RubberDuck rubberDuck = new RubberDuck(new FlyNoWay());

        rubberDuck.fly();
    }
}
