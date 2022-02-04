package nl.music.adapter.us;

import nl.music.adapter.moyoconcerts.Organ;
import nl.music.model.Piano;

public class PianoAdapter implements Organ {

    private Piano piano;

    public PianoAdapter(Piano piano) {
        this.piano = piano;
    }

    @Override
    public void on() {
        // no op
        // for demo only
        System.out.println("Piano is al aan ...  ");
    }

    @Override
    public void play(String tone) {
        this.piano.perform();
    }

    @Override
    public void off() {
        // no op
        // for demo only
        System.out.println("Piano is al uit ...  ");
    }
}
