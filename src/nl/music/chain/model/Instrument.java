package nl.music.chain.model;

public abstract class Instrument {

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public void clean() {
        System.out.printf("Cleaning a %s%n", getName());
    }

    public void play() {
        System.out.println("Playing " + getName());
    }

    public void opbergen() {
        System.out.printf("Opbergen a %s%n", getName());
    }
}
