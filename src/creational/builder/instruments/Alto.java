package creational.builder.instruments;

/** Модель альта
 *  * @author Сергей Шершавин*/

public class Alto {
    static int number = 0;
    int num;

    public Alto() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Альт №" + num;
    }
}
