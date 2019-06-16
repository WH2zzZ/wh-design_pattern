package observer;

/**
 * 观察者,会受到主题变化的通知
 * @Author WangHan
 * @Date 0:08 2019/6/17
 */
public class CurrentConditionsDisplay implements ObServer, DisplayElement{
    private float temperature;
    private float humideity;
    private float pressure;

    private Subject weatherData;

    private CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
    }

    public static CurrentConditionsDisplay instance(Subject weatherData){
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
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
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humideity=" + humideity +
                ", pressure=" + pressure +
                '}');
    }
}
