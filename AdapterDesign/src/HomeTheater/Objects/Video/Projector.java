package HomeTheater.Objects.Video;

import HomeTheater.Objects.Player.StreamingPlayer;

public class Projector {
    StreamingPlayer player;
    private static final String name = "Projector";

    public Projector(StreamingPlayer player) {
        this.player = player;
    }

    public void on(){
        System.out.println( name + " is on");
    }

    public void off(){
        System.out.println( name + " is off");
    }

    public void tvMode(){
        System.out.println( name + " is set to tv mode");
    }

    public void wideScreenMode(){
        System.out.println( name + " is set to wide screen mode");
    }

    @Override
    public String toString() {
        return name;
    }
}
