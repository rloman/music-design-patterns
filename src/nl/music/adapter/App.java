package nl.music.adapter;

import nl.music.adapter.moyoconcerts.OrganService;
import nl.music.adapter.us.PianoAdapter;
import nl.music.model.Piano;

public class App {

    public static void main(String[] args) {

        Piano piano = new Piano("Steinway");
        OrganService organService = new OrganService(new PianoAdapter(piano));

        organService.on();
        organService.play("AGDEF");
        organService.off();
    }
}
