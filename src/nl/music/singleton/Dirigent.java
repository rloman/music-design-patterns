package nl.music.singleton;

import java.util.concurrent.locks.Lock;

public class Dirigent {

    private static Dirigent instance;

    private static Object lockObject = new Object();

    // let op dat je dit dus synchronized maakt. Of via lock met C#
    public static synchronized Dirigent getInstance() {
        if (instance == null) {
            instance = new Dirigent("Jaap van Zweden");
        }

        return instance;
    }

    // c#
    public static Dirigent getInstanceCSharp() {
// uncomment this for C#       lock(lockObject) {
            if (instance == null) {
                instance = new Dirigent("Jaap van Zweden");
            }
// uncomment this for C#        }

        return instance;
    }

    private String name;

    // Maak constructor private!!!
    private Dirigent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
