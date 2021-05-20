package com.wanghan.design.command;

import com.wanghan.design.command.model.Light;
import org.junit.Test;

/**
 * 控制器
 *
 * @Author WangHan
 * @Create 2019/11/14 11:53 下午
 */
public class SimpleControlTest {

    @Test
    public void buttonWasPress(){
        SimpleControl simpleControl = new SimpleControl(new LightOnCommand(new Light()));
        simpleControl.buttonWasPress();
    }
}
