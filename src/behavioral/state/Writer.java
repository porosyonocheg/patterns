package behavioral.state;

/** Общий интерфейс состояний модели писателя
 * @author Сергей Шершавин*/

public abstract class Writer {
    protected Human human;

    public Writer(Human human) {
        this.human = human;
    }

    abstract void write();
}
