package nl.music.flyweight.controller;

import nl.music.flyweight.repo.Repository;
import nl.music.flyweight.repo.TreeRepository;

public class Controller {

    // The repo type can change, now it is a Stub, but perhaps a real DB is applicable later.
// And I left out the service layer
    private Repository repository = new TreeRepository();

    public boolean shoot(int x, int y) {
        if(this.repository.removeTreeFromLocationIfAvailable(x, y)) {
            // some logging etc?
            return true;
        }
        return false;
    }
}
