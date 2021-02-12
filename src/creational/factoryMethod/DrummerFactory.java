package creational.factoryMethod;

/**Фабрика барабанщиков содержит фабричный метод создания экземпляров, а также поле numberOfDrummers - хранящее их количество.
 * @author  Сергей Шершавин*/

public class DrummerFactory implements MusicianFactory {
    static int numberOfDrummers = 0;
    @Override
    public Musician createMusician() {
        return new Drummer(++numberOfDrummers);
    }
}
