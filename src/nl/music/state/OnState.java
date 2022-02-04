package nl.music.state;

public class OnState implements State {

    private Organ organ;

    public OnState(Organ organ) {
        this.organ = organ;
    }

    @Override
    public void turnOn() {
        System.out.println("Organ is already on");
    }

    @Override
    public void play() {
        this.organ.setState(this.organ.getPlayState());
        System.out.println("The organ is now playing");
    }

    @Override
    public void turnOff() {
        this.organ.setState(this.organ.getOffState());
        System.out.println("The organ is now off");
    }
}
