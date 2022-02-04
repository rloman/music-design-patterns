package nl.music.flyweight.ui;

import nl.music.flyweight.controller.Controller;

public class UI {

    private final Controller controller = new Controller();

    public void shoot(int x, int y) {
        if (this.controller.shoot(x, y)) {
            // The output to the UI
            System.out.printf("You hit the tree on location [%02d, %02d]%n", x, y);
        }
    }
}


