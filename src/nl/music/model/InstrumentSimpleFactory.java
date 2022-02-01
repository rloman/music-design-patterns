package nl.music.model;

public class InstrumentSimpleFactory {

    public static Instrument getInstrument(InstrumentType instrumentType) {
        switch (instrumentType) {
            case GUITAR:
                Guitar guitar = new Guitar("Johnson", 6);

                return guitar;
            case PIANO:
                return new Piano("Piano merk");
            default:
                throw new UnsupportedOperationException();
        }

    }
}
