package com.wanghan.design.observer;

/**
 * 主题
 * @Author WangHan
 * @Date 23:56 2019/6/16
 */
public interface Subject {

    void registerObservers(ObServer o);
    void removeObservers(ObServer o);
    void notifyObservers();
}
