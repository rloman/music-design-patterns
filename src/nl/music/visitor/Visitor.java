package nl.music.visitor;

public interface Visitor {

    void visit(Orkestbak orkestbak);
    void visit(InstrumentList instruments);
    void visit(Guitar guitar);
    void visit(Piano piano);
}
