package creational.abstractFactory.bikeTeam;

import creational.abstractFactory.Raceman;
import creational.abstractFactory.Vehicle;

public class Cyclist implements Raceman {

    int number;
    Cyclist(int number) {
        this.number = number;
    }
    @Override
    public void toRace(Vehicle v) {
        System.out.println(this + " управляет " + v);
    }

    @Override
    public String toString() {
        return "велосипедист №" + number;
    }
}
