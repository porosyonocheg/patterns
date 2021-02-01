package creational.abstractFactory.driveTeam;

import creational.abstractFactory.RaceFactory;
import creational.abstractFactory.Raceman;
import creational.abstractFactory.TechnicalStuff;
import creational.abstractFactory.Vehicle;

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
