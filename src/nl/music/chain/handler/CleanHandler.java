package nl.music.chain.handler;

import nl.music.chain.model.Instrument;

// pre order Handler
public class CleanHandler implements Handler {

    private Handler chain;

    public CleanHandler(Handler chain) {
        this.chain = chain;
    }

    @Override
    public void handle(Instrument instrument) {
        instrument.clean();
        if (this.chain != null) {
            this.chain.handle(instrument);
        }
        else {
            System.out.println("Next is null so stopping!");
        }
    }
}
