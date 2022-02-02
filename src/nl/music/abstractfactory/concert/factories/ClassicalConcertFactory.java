package nl.music.abstractfactory.concert.factories;

import nl.music.abstractfactory.concert.model.*;

public class ClassicalConcertFactory implements ConcertFactory {

    @Override
    public Instrument getStringInstrument() {
        return new Piano();
    }

    @Override
    public Instrument getPercussionInstrument() {
        return new Pauk();
    }

    @Override
    public Singer getVocal() {
        return new Sopraan();
    }
}
