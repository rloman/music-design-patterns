package nl.music.flyweight;

import nl.music.flyweight.ui.UI;

public class GameApp {

    public static void main(String[] args) {
        UI ui = new UI();

        ui.shoot(1, 1);
        ui.shoot(1, 1);
        ui.shoot(10, 87);
    }
}