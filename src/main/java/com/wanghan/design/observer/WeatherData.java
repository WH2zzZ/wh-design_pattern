package com.wanghan.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据主题
 * 这个发生变更会通知订阅者
 * @Author WangHan
 * @Date 23:59 2019/6/16
 */
public class WeatherData implements Subject {

    private List<ObServer> obServerList;

    private float temperature;
    private float humideity;
    private float pressure;

    public WeatherData() {
        obServerList = new ArrayList<>();
    }

    @Override
    public void registerObservers(ObServer o) {
        obServerList.add(o);
    }

    @Override
    public void removeObservers(ObServer o) {
        obServerList.removeIf(o::equals);
    }

    @Override
    public void notifyObservers() {
        obServerList.forEach(obServer -> obServer.update(temperature, humideity, pressure));
    }

    /**
     * 一但天气数据发生变化,会调用此方法
     * @Author WangHan
     * @Date 0:06 2019/6/17
     * @Param []
     * @return void
     */
    private void measurememtsChanged(float temperature, float humideity, float pressure){
        notifyObservers();
    }

    public void setMeasurememtsChanged(float temperature, float humideity, float pressure){
        this.temperature = temperature;
        this.humideity = humideity;
        this.pressure = pressure;
        measurememtsChanged(temperature, humideity, pressure);
    }
}
