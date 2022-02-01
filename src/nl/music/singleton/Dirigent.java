package nl.music.singleton;

public class Dirigent {

    private static Dirigent instance;

    public static synchronized Dirigent getInstance() {
        if (instance == null) {
            instance = new Dirigent("Jaap van Zweden");
        }

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
