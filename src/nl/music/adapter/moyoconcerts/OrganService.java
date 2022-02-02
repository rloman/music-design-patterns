package nl.music.adapter.moyoconcerts;

public class OrganService {

    private Organ organ;

    public OrganService(Organ organ) {
        this.organ = organ;
    }

    public void on() {
        organ.on();
    }

    public void play(String tone) {
        organ.play(tone);
    }

    public void off() {
        organ.off();
    }
}
