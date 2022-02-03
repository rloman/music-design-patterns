package nl.music.state;

public class PlayState implements State {

    private Organ organ;


    public PlayState(Organ organ) {
        this.organ = organ;
    }

    @Override
    public void turnOn() {
        System.out.println("You are already playing so why put on the piano");
    }

    @Override
    public void play() {
        System.out.println("Already playing");
    }

    @Override
    public void turnOff() {
        this.organ.setState(this.organ.getOffState());
        System.out.println("Organ is now off");
    }
}
