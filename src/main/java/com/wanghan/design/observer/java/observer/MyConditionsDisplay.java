package com.wanghan.design.observer.java.observer;

import com.wanghan.design.observer.java.subject.WeatherData;
import lombok.Data;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者,会受到主题变化的通知
 * @Author WangHan
 * @Date 0:08 2019/6/17
 */
@Data
public class MyConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humideity;
    private float pressure;

    private MyConditionsDisplay() {}

    public static MyConditionsDisplay instance(Observable weatherData){
        MyConditionsDisplay currentConditionsDisplay = new MyConditionsDisplay();
        weatherData.addObserver(currentConditionsDisplay);
        return currentConditionsDisplay;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            this.humideity = ((WeatherData) o).getHumideity();
            this.pressure = ((WeatherData) o).getPressure();
            this.temperature = ((WeatherData) o).getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("MyConditionsDisplay{" +
                "temperature=" + temperature +
                ", humideity=" + humideity +
                ", pressure=" + pressure +
                '}');
    }
}
