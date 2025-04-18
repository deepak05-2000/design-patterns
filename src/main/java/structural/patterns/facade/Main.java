package structural.patterns.facade;

import structural.patterns.facade.components.DVDPlayer;
import structural.patterns.facade.components.Lights;
import structural.patterns.facade.components.SoundSystem;
import structural.patterns.facade.components.TV;

public class Main {

    public static void main(String[] args) {
        TV tv = new TV();
        SoundSystem soundSystem = new SoundSystem();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Lights lights = new Lights();

        /*
         when we have many components, instead of client
         handling them it will have a facade which provides
         required methods and handle details on itw own
         Client will use only facade.
         */

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(
                tv,
                soundSystem,
                lights,
                dvdPlayer
        );
        homeTheatreFacade.watchMovie("avenger");
        homeTheatreFacade.endMovie();

    }

}
