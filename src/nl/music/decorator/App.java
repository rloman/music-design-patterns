package nl.music.decorator;

public class App {

    public static void main(String[] args) {

        // Gouden Strings om een mahony guitar, mooi toch! :-)
        Instrument guitarSpecial = new GoldenString(new Mahony(new Guitar()));

        System.out.println(guitarSpecial.cost());
        System.out.println(255.50 == guitarSpecial.cost());
    }
}
