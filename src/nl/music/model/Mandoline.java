package nl.music.model;

public class Mandoline extends Instrument {

    Mandoline(String brand) {
        super(brand);
    }

    @Override
    public void perform() {
        System.out.println("Performing mandoline");
    }
}
