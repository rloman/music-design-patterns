package nl.music.visitor;

public class InstrumentCountingVisitor implements Visitor {

    private int guitaren;
    private int violen;
    private int pianos;

    @Override
    public void visit(Orkestbak orkestbak) {
        // Hier wordt normaliter code geprint
        System.out.println("public class Orkestbak {");
        orkestbak.getInstrumentList().accept(this);
        System.out.println("}");
    }

    @Override
    public void visit(InstrumentList instruments) {
//        System.out.println("Visiting InstrumentList");
        System.out.println("\tpublic static void main(String[] args) {");
        for (Instrument instrument : instruments) {
            instrument.accept(this);
        }
        System.out.println("\t}");
    }

    @Override
    public void visit(Guitar guitar) {
        System.out.println("\t\tVisiting guitar");
        guitaren++;
    }

    @Override
    public void visit(Piano piano) {
        System.out.println("\t\tVisiting piano");
        this.pianos++;
    }

    @Override
    public String toString() {
        return "InstrumentCountingVisitor{" +
                "guitaren=" + guitaren +
                ", violen=" + violen +
                ", pianos=" + pianos +
                '}';
    }
}
