package nl.music.chain.handler;

import nl.music.chain.model.Instrument;

public class OpbergenHandler implements Handler {

    private Handler chain;

    public OpbergenHandler(Handler chain) {
        this.chain = chain;
    }

    @Override
    public void handle(Instrument instrument) {

        instrument.opbergen();
        if (chain != null) {
            chain.handle(instrument);
        }
        else {
            System.out.println("Done");
        }
    }
}
