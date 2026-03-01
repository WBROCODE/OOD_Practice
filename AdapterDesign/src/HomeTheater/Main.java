package HomeTheater;

import HomeTheater.Function.HomeTheaterFacade;
import HomeTheater.Objects.Audio.Amplifier;
import HomeTheater.Objects.Audio.Tuner;
import HomeTheater.Objects.Lights.TheaterLights;
import HomeTheater.Objects.Other.PopCorn;
import HomeTheater.Objects.Player.StreamingPlayer;
import HomeTheater.Objects.Video.Projector;
import HomeTheater.Objects.Video.Screen;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner(amplifier);
        StreamingPlayer player = new StreamingPlayer(amplifier);
        Projector projector = new Projector(player);


        TheaterLights teaterLights = new TheaterLights();
        Screen screen = new Screen();
        PopCorn popCorn = new PopCorn();



        HomeTheaterFacade facade = new HomeTheaterFacade(amplifier, screen,
                projector, tuner, teaterLights, popCorn, player);


        facade.watchMovie("The Matrix");
        System.out.println("-----------------");
        facade.endMovie();
        System.out.println("-----------------");
        facade.listenToRadio();
        System.out.println("-----------------");
        facade.endRadio();
    }


}
