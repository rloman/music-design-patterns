package nl.music.model;

public class Piano extends Instrument {
    public Piano(String brand) {
        super(brand);
    }

    @Override
    public void perform() {
        System.out.println("Performing Piano");
    }
}
