package nl.music.state;

public class OffState implements State {

    private Organ organ;

    public OffState(Organ organ) {
        this.organ = organ;
    }

    @Override
    public void turnOn() {
        System.out.println("Organ is turning on");
        organ.setState(this.organ.getOnState());
    }

    @Override
    public void play() {
        System.out.println("Please switch on the organ first");
    }

    @Override
    public void turnOff() {
        System.out.println("The organ is already off");
    }
}
