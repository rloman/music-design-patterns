package nl.music.state;

public class App {

    public static void main(String[] args) {

        Organ organ = new Organ();

        organ.play();
        organ.on();
        organ.play();
        organ.on();
        organ.off();
        organ.off();
    }
}
