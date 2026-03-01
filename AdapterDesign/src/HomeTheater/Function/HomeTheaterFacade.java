package HomeTheater.Function;

import HomeTheater.Objects.Audio.Amplifier;
import HomeTheater.Objects.Audio.Tuner;
import HomeTheater.Objects.Lights.TheaterLights;
import HomeTheater.Objects.Other.PopCorn;
import HomeTheater.Objects.Player.StreamingPlayer;
import HomeTheater.Objects.Video.Projector;
import HomeTheater.Objects.Video.Screen;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Screen screen;
    Projector projector;
    Tuner tuner;
    TheaterLights theaterLights;
    PopCorn popCorn;
    StreamingPlayer player;


    public HomeTheaterFacade(Amplifier amplifier, Screen screen, Projector projector, Tuner tuner, TheaterLights theaterLights, PopCorn popCorn, StreamingPlayer player){
        this.amplifier = amplifier;
        this.screen = screen;
        this.projector = projector;
        this.tuner = tuner;
        this.theaterLights = theaterLights;
        this.popCorn = popCorn;
        this.player = player;
    }

    public void watchMovie(String movie){
        System.out.println("HomeTheaterFacade: Ready to watch a movie");
        popCorn.on();
        popCorn.pop();
        theaterLights.off();
        theaterLights.dim(10);
        screen.on();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setPlayer( player );
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie(){
        System.out.println("HomeTheaterFacade: Stop watching a movie");
        popCorn.off();
        theaterLights.on();
        screen.off();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }

    public void listenToRadio(){
        System.out.println("HomeTheaterFacade: Ready to listen to radio");
        player.on();
        player.setSurroundAudio( "5.1" );
        player.setTwoChannelAudio( "stereo" );
        amplifier.on();
        amplifier.setTuner( tuner );
        tuner.on();
        tuner.setFrequency( 107 );
        tuner.setAm(1);
        tuner.setFm(109);
    }

    public void endRadio(){
        System.out.println("HomeTheaterFacade: Stop listening to radio");
        tuner.off();
        amplifier.off();
        player.stop();
        player.off();
    }


}
