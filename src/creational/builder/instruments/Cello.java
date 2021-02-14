package creational.builder.instruments;

/** Модель виолончели
 *  * @author Сергей Шершавин*/

public class Cello {
    static int number = 0;
    int num;

    public Cello() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Виолончель №" + num;
    }
}
