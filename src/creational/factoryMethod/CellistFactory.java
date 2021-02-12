package creational.factoryMethod;

/** Фабрика виолончелистов содержит фабричный метод создания экземпляров, а также поле numberOfCellists - хранящее их количество.
 * @author  Сергей Шершавин*/

public class CellistFactory implements MusicianFactory {
    static int numberOfCellists = 0;
    @Override
    public Musician createMusician() {
        return new Cellist(++numberOfCellists);
    }
}
