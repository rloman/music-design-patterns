package nl.music.composite;

import nl.music.model.Piano;

public class App {
    public static void main(String[] args) {

        RecList list = new RecList();
        System.out.println(0 == list.size());

        list.add(3);
        list.add("Raymie");
        list.add(new Piano("Steinway"));

        System.out.println(3 == list.size());

        list.pp();
    }
}
