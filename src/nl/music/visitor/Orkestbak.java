package nl.music.visitor;

public class Orkestbak extends Node {

    private InstrumentList instrumentList = new InstrumentList();

    public boolean add(Instrument instrument) {
        return getInstrumentList().add(instrument);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public InstrumentList getInstrumentList() {
        return instrumentList;
    }
}
