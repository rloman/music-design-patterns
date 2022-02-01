package nl.music.factory.simple;

import nl.music.model.Guitar;
import nl.music.model.Instrument;
import nl.music.model.InstrumentFactory;
import nl.music.model.InstrumentType;

public class App {

    public static void main(String[] args) {
        Instrument i = InstrumentFactory.getInstrument(InstrumentType.GUITAR);

//        Instrument i = new Guitar("d", 3); // vout want kan alleen in package worden gemaakt

        System.out.println(i.getClass());
        if (i instanceof Guitar) {
            System.out.println("Het is een gitaar");
        }
    }
}
