package creational.builder.instruments;

/** Модель контрабаса
 *  * @author Сергей Шершавин*/

public class DoubleBass {
    static int number = 0;
    int num;

    public DoubleBass() {
        num = ++number;
    }

    @Override
    public String toString() {
        return "Контрабас №" + num;
    }
}
