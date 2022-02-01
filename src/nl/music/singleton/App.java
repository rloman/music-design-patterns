package nl.music.singleton;

import nl.music.model.Instrument;

public class App {


    public static void main(String[] args) {
        Dirigent vanZweden = Dirigent.getInstance();
        Dirigent haitingDenkJe = Dirigent.getInstance();

        System.out.println(haitingDenkJe.getName());
        System.out.println(vanZweden.getName());

    }
}
