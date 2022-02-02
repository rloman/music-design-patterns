package nl.music.abstractfactory.concert.factories;

import nl.music.abstractfactory.concert.model.Instrument;
import nl.music.abstractfactory.concert.model.Singer;

public interface ConcertFactory {

    Instrument getStringInstrument();
    Instrument getPercussionInstrument();
    Singer getVocal();
}
