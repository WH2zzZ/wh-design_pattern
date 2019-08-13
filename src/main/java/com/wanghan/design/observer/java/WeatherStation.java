package com.wanghan.design.observer.java;

import com.wanghan.design.observer.java.observer.MyConditionsDisplay;
import com.wanghan.design.observer.java.subject.WeatherData;
import com.wanghan.design.observer.java.observer.CurrentConditionsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay.instance(weatherData);
        MyConditionsDisplay.instance(weatherData);

        weatherData.setMeasurememtsChanged(20.0f, 19.0f, 56.0f);
        weatherData.setMeasurememtsChanged(30.0f, 29.0f, 66.0f);
        weatherData.setMeasurememtsChanged(40.0f, 39.0f, 76.0f);
    }
}
