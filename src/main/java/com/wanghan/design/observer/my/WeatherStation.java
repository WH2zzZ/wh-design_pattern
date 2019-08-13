package com.wanghan.design.observer.my;

import com.wanghan.design.observer.my.observer.CurrentConditionsDisplay;
import com.wanghan.design.observer.my.observer.MyConditionsDisplay;
import com.wanghan.design.observer.my.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay.instance(weatherData);
        MyConditionsDisplay.instance(weatherData);

        weatherData.setMeasurememtsChanged(10.4f, 20.4f, 30.5f);
        weatherData.setMeasurememtsChanged(20.4f, 30.4f, 40.5f);
        weatherData.setMeasurememtsChanged(30.4f, 40.4f, 50.5f);
    }
}
