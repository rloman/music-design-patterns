package nl.music.model;

public class GuitarFactory extends InstrumentFactory {

    @Override
    public Guitar getInstrument() {
        return new Guitar("Brandless", 6); // moeilijker kan ik het niet maken, wel makkelijker
    }
}
