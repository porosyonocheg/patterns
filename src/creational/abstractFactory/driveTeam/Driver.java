package AbstractFactory.driveTeam;

import AbstractFactory.Raceman;
import AbstractFactory.Vehicle;

public class Driver implements Raceman {
    int number;

    Driver(int number) {
        this.number = number;
    }
    @Override
    public void toRace(Vehicle v) {
        System.out.println(this + " управляет " + v);
    }

    @Override
    public String toString() {
        return "водитель №" + number;
    }
}
