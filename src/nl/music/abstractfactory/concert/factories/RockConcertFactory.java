package nl.music.abstractfactory.concert.factories;

import nl.music.abstractfactory.concert.model.*;

public class RockConcertFactory implements ConcertFactory {

    @Override
    public Instrument getStringInstrument() {
        return new Guitar();
    }

    @Override
    public Instrument getPercussionInstrument() {
        return new Drum();
    }

    @Override
    public Singer getVocal() {
        return new RockSinger();
    }
}
