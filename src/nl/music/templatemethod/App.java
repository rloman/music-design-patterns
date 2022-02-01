package nl.music.templatemethod;

import nl.music.model.GuitarFactory;
import nl.music.model.Instrument;
import nl.music.model.PianoFactory;

public class App {

    public static void main(String[] args) {
        Instrument i = new GuitarFactory().getInstrument();

        i.arrange();

        i = new PianoFactory().getInstrument();
        i.arrange();

    }
}
