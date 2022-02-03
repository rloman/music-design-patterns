package nl.music.visitor;

public class Guitar extends Instrument {

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
