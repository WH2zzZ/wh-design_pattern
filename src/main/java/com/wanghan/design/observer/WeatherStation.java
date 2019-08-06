package com.wanghan.design.observer;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = CurrentConditionsDisplay.instance(weatherData);

        weatherData.setMeasurememtsChanged(10.4f, 20.4f, 30.5f);
    }
}
