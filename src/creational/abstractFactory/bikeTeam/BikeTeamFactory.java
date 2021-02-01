package creational.abstractFactory.bikeTeam;

import creational.abstractFactory.RaceFactory;
import creational.abstractFactory.Raceman;
import creational.abstractFactory.TechnicalStuff;
import creational.abstractFactory.Vehicle;

public class BikeTeamFactory implements RaceFactory {
    static int numberOfBikers = 0;
    @Override
    public Raceman getRaceman() {
        return new Cyclist(++numberOfBikers);
    }

    @Override
    public Vehicle getVehicle() {
        return new Bike();
    }

    @Override
    public TechnicalStuff getTechnicalStuff() {
        return new BicycleMechanic();
    }
}
