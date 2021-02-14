package creational.builder.instruments;

/** Модель скрипки
 * @author  Сергей Шершавин*/

public class Violin {
    static int number = 0;
    int num;

    public  Violin() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Скрипка №" + num;
    }
}
