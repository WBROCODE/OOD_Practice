package Display;

import Observer.Observer;
import Subject.WeatherData;

public class MaxDisplay implements Display, Observer{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public MaxDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.humidity = Math.max( weatherData.getHumility(),  this.humidity);
        this.temperature =  Math.max( weatherData.getTemperature(),  this.temperature);
        this.pressure = Math.max(weatherData.getPressure(),  this.pressure);;
        display();
    }

    public void display(){
        System.out.println("MAX conditions: "
        + temperature
        + "F degrees and "
        + humidity
        + "% humidity");
    }
}
