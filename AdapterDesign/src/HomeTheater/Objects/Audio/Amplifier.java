package HomeTheater.Objects.Audio;

import HomeTheater.Objects.Player.StreamingPlayer;

public class Amplifier {
    private static final String name = "Amplifier";
    private Tuner tuner;
    private StreamingPlayer player;

    public Amplifier() {

    }

    // one side setter, one side constructor
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setPlayer(StreamingPlayer player){
        this.player = player;
    }
    // method
    public void on() {
        System.out.println( name + " is on");
    }

    public void off() {
        System.out.println( name + " is off");
    }

    public void setVolume(int volume) {
        System.out.println( name + " volume is set to " + volume);
    }

    @Override
    public String toString() {
        return name;
    }

}
