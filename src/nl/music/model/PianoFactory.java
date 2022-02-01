package nl.music.model;

public class PianoFactory extends InstrumentFactory {

    @Override
    public Piano getInstrument() {
        return new Piano("Guiness");
    }
}
