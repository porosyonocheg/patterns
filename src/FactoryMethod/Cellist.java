package FactoryMethod;

public class Cellist implements Musician {
    int number;

    public Cellist(int number) {
        this.number = number;
    }

    @Override
    public void playMusic() {
        System.out.println(this + " is playing the cello");
    }

    @Override
    public String toString() {
        return "Cellist №" + number;
    }
}
