package AbstractFactory.bikeTeam;

import AbstractFactory.RaceFactory;
import AbstractFactory.Raceman;
import AbstractFactory.TechnicalStuff;
import AbstractFactory.Vehicle;

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
