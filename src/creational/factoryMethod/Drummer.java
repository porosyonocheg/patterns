package creational.factoryMethod;

/** Модель барабанщика. Содержит реализацию интерфейса {@link Musician} и
 * поле number - для идентификации конкретного экземпляра.
 * @author  Сергей Шершавин*/

public class Drummer implements Musician {
    int number;

    public Drummer(int number) {
        this.number = number;
    }

    @Override
    public void playMusic() {
        System.out.println(this + " is playing the drums");
    }

    @Override
    public String toString() {
        return "Drummer №" + number;
    }
}
