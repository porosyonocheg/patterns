package creational.builder.instruments;

/** Модель тромбона
 *  * @author Сергей Шершавин*/

public class Trombone {
    static int number = 0;
    int num;

    public Trombone() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Тромбон №" + num;
    }
}
