package nl.music.templatemethod.sortingusecase;

class Persoon implements Comparable<Persoon> {
    private String name;

    public Persoon(String name) {
        this.name = name;
    }

    // This is the analogy of the 'perform' method in Instrument (abstract) and subclass (concrete)
    @Override
    public int compareTo(Persoon o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "name='" + name + '\'' +
                '}';
    }
}
