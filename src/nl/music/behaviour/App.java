package nl.music.behaviour;

import nl.music.model.GuitarFactory;
import nl.music.model.Instrument;
import nl.music.model.PianoFactory;

public class App {

    public static void main(String[] args) {
        Instrument i = new PianoFactory().getInstrument();
        i.play();

        i = new GuitarFactory().getInstrument();
        i.play();

        i.setPlayBehaviour(new PlayKeysBehaviour());
        i.play();
    }
}
