package creational.abstractFactory.horseTeam;

import creational.abstractFactory.TechnicalStuff;

public class Stableman implements TechnicalStuff {
    @Override
    public void repare() {
        System.out.println("Конюх кормит/лечит лошадь");
    }
}
