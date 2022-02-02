package nl.music.iterator.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Ann", "Zulu", "Quebec", "Leo"));

        Iterator<String> iterator = names.iterator();

        int count = 1;

        // 1997
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(count+") "+name);
            count++;
        }

        // 2005
        for (String name : names) {
            System.out.println(name);
        }
    }
}
