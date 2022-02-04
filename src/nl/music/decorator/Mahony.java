package nl.music.decorator;

public class Mahony extends Attribuut {

    private Instrument instrument;

    public Mahony(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public double cost() {
        return 115 + instrument.cost();
    }
}
