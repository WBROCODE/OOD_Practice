package HomeTheater.Objects.Video;

import HomeTheater.Objects.Player.StreamingPlayer;

public class Screen {
    private final static String name = "Screen";

    public void on(){
        System.out.println( name + " is on");
    }

    public void off(){
        System.out.println( name + " is off");
    }

    @Override
    public String toString() {
        return name;
    }
}
