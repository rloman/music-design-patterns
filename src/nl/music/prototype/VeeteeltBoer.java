package nl.music.prototype;

public class VeeteeltBoer extends Boer {

    @Override
    public Boer clone() throws CloneNotSupportedException {
        return (VeeteeltBoer) super.clone();
    }
}
