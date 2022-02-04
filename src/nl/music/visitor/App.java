package nl.music.visitor;

public class App {

    public static void main(String[] args) {

        Orkestbak orkestBak = new Orkestbak();
        orkestBak.add(new Guitar());
        orkestBak.add(new Piano());

        Visitor visitor = new InstrumentCountingVisitor();
        orkestBak.accept(visitor);
    }
}
