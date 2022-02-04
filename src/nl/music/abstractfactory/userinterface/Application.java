package nl.music.abstractfactory.userinterface;

public class Application {

    public static void main(String[] args) {
        UI ui = new UI(new LinuxComponentFactory());

        ui.draw();
    }
}
