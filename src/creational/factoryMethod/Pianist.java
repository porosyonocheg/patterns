package creational.factoryMethod;

/** Модель пианиста. Содержит реализацию интерфейса {@link Musician} и
 * поле number - для идентификации конкретного экземпляра.
 * @author  Сергей Шершавин*/

public class Pianist implements Musician {
    int number;

    public Pianist(int number) {
        this.number = number;
    }

    @Override
    public void playMusic() {
        System.out.println(this + " is playing the piano");
    }

    @Override
    public String toString() {
        return "Pianist №" + number;
    }
}
