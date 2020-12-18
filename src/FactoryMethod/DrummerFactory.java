package FactoryMethod;

public class DrummerFactory implements MusicianFactory {
    static int numberOfDrummers = 0;
    @Override
    public Musician createMusician() {
        return new Drummer(++numberOfDrummers);
    }
}
