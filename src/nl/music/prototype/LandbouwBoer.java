package nl.music.prototype;

public class LandbouwBoer extends Boer {
    @Override
    public Boer clone() throws CloneNotSupportedException {
        return (LandbouwBoer) super.clone();
    }
}
