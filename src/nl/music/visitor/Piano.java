package nl.music.visitor;

public class Piano extends Instrument {

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
