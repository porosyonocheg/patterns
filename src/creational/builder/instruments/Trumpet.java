package creational.builder.instruments;

/** Модель духовой трубы
 *  * @author Сергей Шершавин*/

public class Trumpet {
    static int number = 0;
    int num;

    public Trumpet() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Труба №" + num;
    }
}
