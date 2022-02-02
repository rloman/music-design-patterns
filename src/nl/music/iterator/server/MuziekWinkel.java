package nl.music.iterator.server;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MuziekWinkel implements Iterable<Instrument> {

    private final List<Instrument> voorraad = new ArrayList<>();

    public boolean isEmpty() {
        return voorraad.isEmpty();
    }

    public boolean add(Instrument instrument) {
        return voorraad.add(instrument);
    }

    public boolean remove(Object o) {
        return voorraad.remove(o);
    }

    @Override
    public Iterator<Instrument> iterator() {
        return voorraad.iterator();
    }
}
