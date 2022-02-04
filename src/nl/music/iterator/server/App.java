package nl.music.iterator.server;

public class App {

    public static void main(String[] args) {

        MuziekWinkel muziekWinkel = new MuziekWinkel();
        muziekWinkel.add(new Piano());
        muziekWinkel.add(new Mandoline());
        muziekWinkel.add(new Guitar());

        for(Instrument instrument: muziekWinkel) {
            System.out.println(instrument.getClass().getSimpleName());
        }
    }
}
