package creational.factoryMethod;

public class PianistFactory implements MusicianFactory {
    static int numberOfPianists = 0;
    @Override
    public Musician createMusician() {
        return new Pianist(++numberOfPianists);
    }
}
