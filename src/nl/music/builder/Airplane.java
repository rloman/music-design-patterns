package nl.music.builder;

public class Airplane {
    private final String brand;
    private double weight;
    private int wings;
    // en kan later meer fields zijn hierboven

    private Airplane(AirplaneBuilder builder) {
        this.brand = builder.brand;
        this.weight = builder.weight;
        this.wings = builder.wings;
    }

    public static class AirplaneBuilder {
        private String brand;
        private double weight;
        private int wings;

        public AirplaneBuilder(String brand) {
            this.brand = brand;
        }

        public AirplaneBuilder withWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public AirplaneBuilder withWings(int wings) {
            this.wings = wings;
            return this;
        }

        // the build method
        public Airplane build() {
            return new Airplane(this);
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", wings=" + wings +
                '}';
    }
}