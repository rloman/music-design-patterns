package nl.music.prototype;


public abstract class Boer /* extends Object */  implements Cloneable {

    public String name;
    public StringBuilder builder = new StringBuilder();

    @Override
    public Boer clone() throws CloneNotSupportedException {

        // clone the object
        Boer boer = (Boer) super.clone();

        // manually perform a deep copy of the builder.
        boer.builder = new StringBuilder(builder.toString());

        return boer;
    }
}

