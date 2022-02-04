package nl.music.chain.handler;

import nl.music.chain.model.Instrument;

public class PlayHandler implements  Handler {

    private Handler chain;

    public PlayHandler(Handler chain) {
        this.chain = chain;
    }

    @Override
    public void handle(Instrument instrument) {

        instrument.play();
        if (chain != null) {
            chain.handle(instrument);
        }
        else {
            System.out.println("Done");
        }
    }
}
