package com.wanghan.design.decorator.component;

import lombok.Data;

/**
 * 综合咖啡
 *
 * @Author WangHan
 * @Create 2019-08-11 18:39
 */
@Data
public class HouseBlend implements Beverage{

    @Override
    public String getDescription() {
        return "综合咖啡";
    }

    @Override
    public double cost() {
        return 20;
    }
}
