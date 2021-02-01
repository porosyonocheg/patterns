package creational.factoryMethod;

public class Drummer implements Musician {
    int number;
    Drummer(int number) {
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
