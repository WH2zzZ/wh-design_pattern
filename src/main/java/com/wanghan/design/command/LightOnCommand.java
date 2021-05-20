package com.wanghan.design.command;

import com.wanghan.design.command.model.Light;

/**
 * 打开灯
 *
 * @Author WangHan
 * @Create 2019/11/14 11:50 下午
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
