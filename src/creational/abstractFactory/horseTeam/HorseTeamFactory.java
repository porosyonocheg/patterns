package creational.abstractFactory.horseTeam;

import creational.abstractFactory.RaceFactory;
import creational.abstractFactory.Raceman;
import creational.abstractFactory.TechnicalStuff;
import creational.abstractFactory.Vehicle;

/** Реализация фабрики создания команды для скачек
 * @author Сергей Шершавин*/

public class HorseTeamFactory implements RaceFactory {
    static int numberOfHorsmen = 0;
    @Override
    public Raceman getRaceman() {
        return new Horseman(++numberOfHorsmen);
    }

    @Override
    public Vehicle getVehicle() {
        return new Horse();
    }

    @Override
    public TechnicalStuff getTechnicalStuff() {
        return new Stableman();
    }
}
