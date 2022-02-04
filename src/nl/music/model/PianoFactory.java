package nl.music.model;

import nl.music.behaviour.PlayKeysBehaviour;

public class PianoFactory extends InstrumentFactory {

    @Override
    public Piano getInstrument() {
        Piano piano = new Piano("Guiness");
        piano.setPlayBehaviour(new PlayKeysBehaviour());

        return piano;
    }
}
