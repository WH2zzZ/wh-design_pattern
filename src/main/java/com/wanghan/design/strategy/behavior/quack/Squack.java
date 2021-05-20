package com.wanghan.design.strategy.behavior.quack;

import com.wanghan.design.strategy.behavior.QuackStrategy;

/**
 * 橡皮鸭子叫声
 * @Author WangHan
 * @Create 2021/5/21 12:28 上午
 */
public class Squack implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("橡皮鸭子叫了");
    }
}
