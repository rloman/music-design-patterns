package nl.music.decorator;

public class GoldenString extends Attribuut {

    public Instrument instrument;

    public GoldenString(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public double cost() {
        return 55.50 + instrument.cost();
    }
}
