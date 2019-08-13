package com.wanghan.design.observer.java.subject;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * 天气数据主题
 * 这个发生变更会通知订阅者
 * @Author WangHan
 * @Date 23:59 2019/6/16
 */
@Data
public class WeatherData extends Observable {

    private float temperature;
    private float humideity;
    private float pressure;

    /**
     * 一但天气数据发生变化,会调用此方法
     * @Author WangHan
     * @Date 0:06 2019/6/17
     * @Param []
     * @return void
     */
    private void measurememtsChanged(float temperature, float humideity, float pressure){
        setChanged();
        notifyObservers();
    }

    public void setMeasurememtsChanged(float temperature, float humideity, float pressure){
        setChanged();
        this.temperature = temperature;
        this.humideity = humideity;
        this.pressure = pressure;
        measurememtsChanged(temperature, humideity, pressure);
    }
}
