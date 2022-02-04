package nl.music.composite;

public class Tree {

    private Integer value;

    private Tree left;
    private Tree right;

    public void add(int value) {
        if (this.value == null) {
            this.value = value;
            this.left = new Tree();
            this.right = new Tree();
        }
        else {
            if (value < this.value) {
                left.add(value);
            }
            else {
                right.add(value);
            }
        }
    }
}
