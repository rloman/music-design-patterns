package nl.music.composite;

public class RecList {

    private Object head;
    private RecList tail;

    public void add(Object object) {
        if (head == null) {
            this.head = object;
            tail = new RecList();
        } else {
            tail.add(object);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        return 1 + tail.size();
    }

    // Assignment: pretty print the list
}
