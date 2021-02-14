package creational.builder.instruments;

/** Модель саксофона
 *  * @author Сергей Шершавин*/

public class Saxophone {
    static int number = 0;
    int num;

    public Saxophone() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Саксофон №" + num;
    }
}
