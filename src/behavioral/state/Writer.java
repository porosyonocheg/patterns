package behavioral.state;

public abstract class Writer {
    protected Human human;

    public Writer(Human human) {
        this.human = human;
    }

    abstract void write();
}
