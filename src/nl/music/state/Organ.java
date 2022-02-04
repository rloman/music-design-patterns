package nl.music.state;

public class Organ {

    private State state; // current state

    private final State onState = new OnState(this);
    private final State playState = new PlayState(this);
    private final State offState = new OffState(this);

    public Organ() {
        this.state = getOffState();
    }

    void setState(State state) {
        this.state = state;
    }

    State getOnState() {
        return onState;
    }

    State getOffState() {
        return offState;
    }

    State getPlayState() {
        return playState;
    }

    public void on() {
        this.state.turnOn();
    }

    public void play() {
        this.state.play();
    }

    public void off() {
        this.state.turnOff();
    }
}
