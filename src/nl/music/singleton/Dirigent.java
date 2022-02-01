package nl.music.singleton;

public class Dirigent {

    private static Dirigent instance;

    // let op dat je dit dus synchronized maakt. Of via lock met C#
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
