package creational.abstractFactory.bikeTeam;

import creational.abstractFactory.TechnicalStuff;

/** Модель веломеханика
 * @author Сергей Шершавин*/

public class BicycleMechanic implements TechnicalStuff {
    @Override
    public void repare() {
        System.out.println("Веломеханики чинят велосипед");
    }
}
