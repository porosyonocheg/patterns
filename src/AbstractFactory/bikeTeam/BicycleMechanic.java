package AbstractFactory.bikeTeam;

import AbstractFactory.TechnicalStuff;

public class BicycleMechanic implements TechnicalStuff {
    @Override
    public void repare() {
        System.out.println("Веломеханики чинят велосипед");
    }
}
