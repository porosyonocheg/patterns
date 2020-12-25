package AbstractFactory.horseTeam;

import AbstractFactory.Raceman;
import AbstractFactory.Vehicle;

public class Horseman implements Raceman {
    int number;
    Horseman(int number) {
        this.number = number;
    }
    @Override
    public void toRace(Vehicle v) {
        System.out.println(this + " оседлал " + v);
    }

    @Override
    public String toString() {
        return "наездник №" + number;
    }
}
