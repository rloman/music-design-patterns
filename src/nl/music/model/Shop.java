package nl.music.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final InstrumentFactory factory;
    private List<Instrument> store = new ArrayList<>();

    public Shop(InstrumentFactory instrumentFactory) {
        this.factory = instrumentFactory;
    }

    public void buy() {
        Instrument gekochtInstrument = factory.getInstrument();
        System.err.println("Ik ben van type: "+gekochtInstrument.getClass().getSimpleName());
        this.store.add(gekochtInstrument);
    }
}
