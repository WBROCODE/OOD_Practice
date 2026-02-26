package Display;

import Observer.Observer;
import Subject.WeatherData;

public class StatisticsDisplay implements Observer, Display{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    public void update(){
        this.humidity = weatherData.getHumility();
        this.temperature = weatherData.getTemperature();
        display();
    }


    public void display(){
        System.out.println("Current conditions: "
        + temperature
        + "F degrees and "
        + humidity
        + "% humidity");
    }
}
