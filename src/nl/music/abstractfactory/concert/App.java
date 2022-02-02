package nl.music.abstractfactory.concert;

import nl.music.abstractfactory.concert.factories.ClassicalConcertFactory;
import nl.music.abstractfactory.concert.factories.RockConcertFactory;

public class App {

    public static void main(String[] args) {
        
        Performance concert = new Performance(new RockConcertFactory());
        concert.playConcert();
        concert = new Performance(new ClassicalConcertFactory());
        concert.playConcert();
    }
}
