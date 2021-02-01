package creational.factoryMethod;

public class CellistFactory implements MusicianFactory {
    static int numberOfCellists = 0;
    @Override
    public Musician createMusician() {
        return new Cellist(++numberOfCellists);
    }
}
