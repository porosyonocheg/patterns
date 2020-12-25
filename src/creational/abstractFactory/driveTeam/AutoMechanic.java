package AbstractFactory.driveTeam;

import AbstractFactory.TechnicalStuff;

public class AutoMechanic implements TechnicalStuff {
    @Override
    public void repare() {
        System.out.println("Автомеханик чинит автомобиль");
    }
}
