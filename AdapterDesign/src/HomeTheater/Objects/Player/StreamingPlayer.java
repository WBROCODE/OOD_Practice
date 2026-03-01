package HomeTheater.Objects.Player;

import HomeTheater.Objects.Audio.Amplifier;
import HomeTheater.Objects.Video.Projector;

public class StreamingPlayer {
    private static final String name = "StreamingPlayer";
    Amplifier amplifier;

    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on(){
        System.out.println( name + " is on");
    }
    public void off(){
        System.out.println( name + " is off");
    }

    public void play(String movie){
        System.out.println( movie + " is playing");
    }

    public void stop(){
        System.out.println( name + " is stop");
    }

    public void setSurroundAudio(String surroundAudio){
        System.out.println( name + " is set to " + surroundAudio);
    }

    public void setTwoChannelAudio(String twoChannelAudio){
        System.out.println( name + " is set to " + twoChannelAudio);
    }

    @Override
    public String toString() {
        return name;
    }
}
