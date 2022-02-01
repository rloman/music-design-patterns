package nl.music.model;

public abstract class Instrument {

    private String brand;

    /* package private, dus alleen in package */
    Instrument(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
