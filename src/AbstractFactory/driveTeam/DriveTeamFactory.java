package AbstractFactory.driveTeam;

import AbstractFactory.RaceFactory;
import AbstractFactory.Raceman;
import AbstractFactory.TechnicalStuff;
import AbstractFactory.Vehicle;

public class DriveTeamFactory implements RaceFactory {
    static int numberOfDrivers = 0;
    @Override
    public Raceman getRaceman() {
        return new Driver(++numberOfDrivers);
    }

    @Override
    public Vehicle getVehicle() {
        return new Car();
    }

    @Override
    public TechnicalStuff getTechnicalStuff() {
        return new AutoMechanic();
    }
}
