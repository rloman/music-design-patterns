package nl.music.chain.handler;

import nl.music.chain.model.Guitar;
import nl.music.chain.model.Pauk;

public class App {

    public static void main(String[] args) {
        Handler handler = new CleanHandler(new PlayHandler(new OpbergenHandler(null)));

        handler.handle(new Guitar());
//        handler.handle(new Pauk());
    }
}
