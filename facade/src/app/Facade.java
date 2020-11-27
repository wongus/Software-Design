package app;

public class Facade {

    Amplifier amp = new Amplifier("Top-O-Line Amplifier");
    Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
    DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
    CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
    Projector projector = new Projector("Top-O-Line Projector", dvd);
    TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
    Screen screen = new Screen("Theater Screen");
    PopcornPopper popper = new PopcornPopper("Popcorn Popper");

    public void watchMovie(int lightLevel, int volume, String movie) {
        // pop popcorn
        popper.on();
        popper.pop();

        // dim lights
        lights.on();
        lights.dim(lightLevel);

        // set up projector
        screen.down();
        projector.on();
        projector.wideScreenMode();

        // set up amp
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(volume);

        // play movie
        dvd.on();
        dvd.play(movie);

        System.out.println("playing movie");
    }

    public void endMovie() {
        //turn off popcornMachine
        popper.off();

        // turn on lights
        lights.on();

        // turn off projector
        screen.up();
        projector.off();

        // turn off amp
        amp.off();

        // turn off dvdPlayer and eject
        dvd.stop();
        dvd.eject();
        dvd.off();

        System.out.println("movie over");
    }
}