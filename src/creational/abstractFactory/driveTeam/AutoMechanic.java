package creational.abstractFactory.driveTeam;

import creational.abstractFactory.TechnicalStuff;

/** Модель автомеханика
 * @author Сергей Шершавин*/

public class AutoMechanic implements TechnicalStuff {
    @Override
    public void repare() {
        System.out.println("Автомеханик чинит автомобиль");
    }
}
