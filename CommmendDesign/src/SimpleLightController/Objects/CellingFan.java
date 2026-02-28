package SimpleLightController.Objects;

public class CellingFan {
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;
    public static final int OFF = 0;
    String location;
    int speed;

    public CellingFan(String location){
        this.location = location;
        speed = OFF;
    }

    public void low(){
        speed = LOW;
        System.out.println(location + " Celling Fan is low");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " Celling Fan is medium");
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " Celling Fan is high");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " Celling Fan is off");
    }

    public int getSpeed(){
        return speed;
    }
}
