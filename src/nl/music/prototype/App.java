package nl.music.prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        VeeteeltBoer c = new VeeteeltBoer();
        c.name = "Johnny de Veeteelboer";

        VeeteeltBoer clone = (VeeteeltBoer) c.clone();
        System.out.println(clone.getClass().getName());
        System.out.println(clone.name);
        System.out.println(false == (clone == c));
        System.out.println(c.getClass().equals(clone.getClass()));
        System.out.println(c.name == clone.name);
        System.out.println(c.builder != clone.builder);
    }
}
