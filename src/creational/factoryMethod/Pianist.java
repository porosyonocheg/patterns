package creational.factoryMethod;

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
