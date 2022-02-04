package nl.music.model;

import nl.music.behaviour.PlayWithStrings;

public class GuitarFactory extends InstrumentFactory {

    @Override
    public Guitar getInstrument() {
        Guitar guitar = new Guitar("Brandless", 6); // moeilijker kan ik het niet maken, wel makkelijker
        guitar.setPlayBehaviour(new PlayWithStrings());

        return guitar;
    }
}
