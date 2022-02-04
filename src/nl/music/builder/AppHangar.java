package nl.music.builder;

public class AppHangar {

    public static void main(String[] args) {

        {
            Airplane airplane = new Airplane.AirplaneBuilder("Boeing").withWeight(350)
                    .withWings(6).build();
        }

        Airplane.AirplaneBuilder airplaneBuilder = new Airplane.AirplaneBuilder("Boeing").withWeight(350)
                .withWings(6);
        for (int i = 0; i < 3; i++) {
            Airplane plane2 = airplaneBuilder.build();
            System.out.println(plane2);
            System.out.println(plane2.hashCode());
        }
    }
}
