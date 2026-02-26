package Subject;

import java.util.*;

import Observer.Observer;

public class WeatherData implements Subject{
    private List<Observer> observers;
    private float humility;
    private float pressure;
    private float temperature;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }
    public void notifyObserver(){
        for(Observer o : observers){
            o.update();
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }


    public void setter(float humility,float pressure,float temperature){
        this.temperature = temperature;
        this.humility = humility;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getHumility(){
        return humility;
    }

    public float getPressure(){
        return pressure;
    }

    public float getTemperature(){
        return temperature;
    }



}   
