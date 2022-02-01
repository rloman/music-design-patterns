package nl.music.model;

public class InstrumentFactory {

    public static Instrument getInstrument(InstrumentType instrumentType) {
        switch (instrumentType) {
            case GUITAR:
                Guitar guitar = new Guitar("Johnson", 6);

                return guitar;
//            case PIANO:
            default:
                throw new UnsupportedOperationException();
        }
    }
}
