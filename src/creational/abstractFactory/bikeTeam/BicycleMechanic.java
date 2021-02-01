package creational.abstractFactory.bikeTeam;

import creational.abstractFactory.TechnicalStuff;

public class BicycleMechanic implements TechnicalStuff {
    @Override
    public void repare() {
        System.out.println("Веломеханики чинят велосипед");
    }
}
