package nl.music.model;

public class Guitar extends Instrument {

    private int strings;

    Guitar(String brand, int strings) {
        super(brand);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public void perform() {
        System.out.println("Performing guitar ... ");
    }
}
