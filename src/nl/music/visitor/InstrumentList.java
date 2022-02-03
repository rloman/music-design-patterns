package nl.music.visitor;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstrumentList extends Node implements Iterable<Instrument> {

    private List<Instrument> instruments = new ArrayList<>();

   public boolean add(Instrument instrument) {
        return instruments.add(instrument);
    }

    @Override
    public Iterator<Instrument> iterator() {
        return this.instruments.iterator();
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
