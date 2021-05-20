package com.wanghan.design.strategy.behavior.quack;

import com.wanghan.design.strategy.behavior.QuackStrategy;

/**
 * 普通鸭子叫声
 * @Author WangHan
 * @Create 2021/5/21 12:27 上午
 */
public class NormalQuack implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("普通鸭子叫了");
    }
}
