package creational.abstractFactory.horseTeam;

import creational.abstractFactory.Raceman;
import creational.abstractFactory.Vehicle;

/** Модель всадника
 * @author Сергей Шершавин*/

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
