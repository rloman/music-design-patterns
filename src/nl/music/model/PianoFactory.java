package nl.music.model;

public class PianoFactory extends InstrumentFactory {

    @Override
    public Instrument getInstrument() {
        return new Piano("Guiness");
    }
}
