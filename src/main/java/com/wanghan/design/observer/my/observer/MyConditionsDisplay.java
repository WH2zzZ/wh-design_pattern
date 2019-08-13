package com.wanghan.design.observer.my.observer;

import com.wanghan.design.observer.my.subject.Subject;
import lombok.Data;

/**
 * 观察者,会受到主题变化的通知
 * @Author WangHan
 * @Date 0:08 2019/6/17
 */
@Data
public class MyConditionsDisplay implements ObServer, DisplayElement {
    private float temperature;
    private float humideity;
    private float pressure;

    private MyConditionsDisplay() {}

    public static MyConditionsDisplay instance(Subject weatherData){
        MyConditionsDisplay currentConditionsDisplay = new MyConditionsDisplay();
        weatherData.registerObservers(currentConditionsDisplay);
        return currentConditionsDisplay;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humideity = humidity;
        this.pressure = pressure;
        display();

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
