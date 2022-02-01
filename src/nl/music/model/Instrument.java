package nl.music.model;

import nl.music.behaviour.PlayBehaviour;

public abstract class Instrument {

    private String brand;
    private PlayBehaviour playBehaviour; // this in / might be a null pointer (be aware of that)

    /* package private, dus alleen in package */
    Instrument(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPlayBehaviour(PlayBehaviour playBehaviour) {
        this.playBehaviour = playBehaviour;
    }

    public void play() {
        if (playBehaviour != null) {
            playBehaviour.play();
        }
    }
}
