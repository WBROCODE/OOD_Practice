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

    public void update(float humidity,float pressure,float temperature){
        this.humidity = Math.max(humidity,  this.humidity);
        this.temperature =  Math.max(temperature,  this.temperature);
        this.pressure = Math.max(pressure,  this.pressure);;
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
