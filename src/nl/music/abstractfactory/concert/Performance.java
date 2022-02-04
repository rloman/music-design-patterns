package nl.music.abstractfactory.concert;

import nl.music.abstractfactory.concert.factories.ConcertFactory;
import nl.music.abstractfactory.concert.model.Instrument;
import nl.music.abstractfactory.concert.model.Singer;

public class Performance {
    private ConcertFactory concertFactory;

    public Performance(ConcertFactory concertFactory) {
        this.concertFactory = concertFactory;
    }

    public void playConcert() {

        Instrument stringer = concertFactory.getStringInstrument();
        Instrument percussionInstrument = concertFactory.getPercussionInstrument();
        Singer singer = concertFactory.getVocal();

        stringer.play();
        percussionInstrument.play();
        singer.play();
    }
}
