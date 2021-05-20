package com.wanghan.design.command;

/**
 * 控制器
 *
 * @Author WangHan
 * @Create 2019/11/14 11:53 下午
 */
public class SimpleControl {

    private Command command;

    public SimpleControl(Command command) {
        this.command = command;
    }

    public void buttonWasPress(){
        command.execute();
    }
}
