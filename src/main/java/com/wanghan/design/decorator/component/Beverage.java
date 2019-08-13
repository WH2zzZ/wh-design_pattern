package com.wanghan.design.decorator.component;

/**
 * 饮料所有的
 *
 * @Author WangHan
 * @Create 2019-08-11 18:16
 */
public interface Beverage {

    /**
     * 获取描述
     * @return
     */
    String getDescription();

    /**
     * 获取价格
     * @return
     */
    double cost();
}
