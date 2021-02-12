package creational.factoryMethod;

/**Фабрика пианистов содержит фабричный метод создания экземпляров, а также поле numberOfPianists - хранящее их количество.
 * @author  Сергей Шершавин*/

public class PianistFactory implements MusicianFactory {
    static int numberOfPianists = 0;
    @Override
    public Musician createMusician() {
        return new Pianist(++numberOfPianists);
    }
}
