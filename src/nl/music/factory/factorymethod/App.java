package nl.music.factory.factorymethod;

import nl.music.model.GuitarFactory;
import nl.music.model.PianoFactory;
import nl.music.model.Shop;

public class App {

    public static void main(String[] args) {
        Shop shop = null;
        switch (args[0]) {
            case "guitar":
                shop = new Shop(new GuitarFactory());
                break;
            case "piano":
                // weten dat ik een guitarshop ben, komt van 'buiten'
                shop = new Shop(new PianoFactory());
                break;
        }
        shop.buy();
    }
}
