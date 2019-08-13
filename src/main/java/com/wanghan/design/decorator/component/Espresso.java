package com.wanghan.design.decorator.component;

import lombok.Data;

/**
 * 浓缩咖啡
 *
 * @Author WangHan
 * @Create 2019-08-11 18:39
 */
@Data
public class Espresso implements Beverage{

    @Override
    public String getDescription() {
        return "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 10;
    }
}
