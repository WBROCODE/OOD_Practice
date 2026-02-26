package Display;

import Observer.Observer;
import Subject.Subject;

public class StatisticsDisplay implements Observer, Display{
    private float temperature;
    private float humidity;
    private Subject WeatherData;

    public StatisticsDisplay(Subject WeatherData){
        this.WeatherData = WeatherData;
        WeatherData.registerObserver(this);
    }


    public void update(float humidity,float pressure,float temperature){
        this.humidity = humidity;
        this.temperature = temperature;
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
