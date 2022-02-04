package nl.music.abstractfactory.concert.model;

public abstract class Instrument {

    public void play() {
        System.out.println("Playing " + this.getClass().getSimpleName());
    }

}
