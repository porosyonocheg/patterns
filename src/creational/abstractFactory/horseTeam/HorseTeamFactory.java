package AbstractFactory.horseTeam;

import AbstractFactory.RaceFactory;
import AbstractFactory.Raceman;
import AbstractFactory.TechnicalStuff;
import AbstractFactory.Vehicle;

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
