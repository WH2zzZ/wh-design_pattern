package com.wanghan.design.observer.my.observer;

/**
 * 观察者
 * @Author WangHan
 * @Date 23:56 2019/6/16
 */
public interface ObServer {
    void update(float temp, float humidity, float pressure);

}
