package facade;

import facade.components.DVDPlayer;
import facade.components.Lights;
import facade.components.SoundSystem;
import facade.components.TV;

public class HomeTheatreFacade {

    private TV tv;
    private SoundSystem soundSystem;
    private Lights lights;
    private DVDPlayer dvdPlayer;

    public HomeTheatreFacade(TV tv, SoundSystem soundSystem, Lights lights, DVDPlayer dvdPlayer) {
        this.tv = tv;
        this.soundSystem = soundSystem;
        this.lights = lights;
        this.dvdPlayer = dvdPlayer;
    }

    public void watchMovie(String movie) {
        tv.turnOn();
        lights.dimLights();
        dvdPlayer.playMovie(movie);
        soundSystem.setLevel(10);
        System.out.println("Enjoy movie...");
    }
    public void endMovie() {
        System.out.println("Shutting down...");
        tv.turnOff();
    }
}
