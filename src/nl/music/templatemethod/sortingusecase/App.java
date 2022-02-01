package nl.music.templatemethod.sortingusecase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //create a list of personen
        List<Persoon> personen = new ArrayList<>();

        personen.add(new Persoon("Johny"));
        personen.add(new Persoon("Elton"));
        personen.add(new Persoon("Annee"));

        // Unsorted
        System.out.println("Unsorted => "+personen);

        // Template use  (this is the analogy of the 'arrange' template method in Instrument
        Collections.sort(personen);

        // Sorted
        System.out.println("  Sorted => "+personen);
    }
}