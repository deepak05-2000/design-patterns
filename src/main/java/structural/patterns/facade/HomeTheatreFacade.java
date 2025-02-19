package structural.patterns.facade;

import structural.patterns.facade.components.DVDPlayer;
import structural.patterns.facade.components.Lights;
import structural.patterns.facade.components.SoundSystem;
import structural.patterns.facade.components.TV;

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
