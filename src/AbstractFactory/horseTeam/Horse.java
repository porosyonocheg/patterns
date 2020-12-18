package AbstractFactory.horseTeam;

import AbstractFactory.Vehicle;

public class Horse implements Vehicle {
    String species;
    Horse() {
        switch ((int) (Math.random()*4)) {
            case 0: species = "Будённовская лошадь"; break;
            case 1: species = "Ганноверская лошадь"; break;
            case 2: species = "Ахалтекинская лошадь"; break;
            case 3: species = "Донская лошадь"; break;
            case 4: species = "Иберийская лошадь"; break;
        }
    }
    @Override
    public void move() {
        System.out.println(this + " поскакала!");
    }

    @Override
    public String toString() {
        return species;
    }
}
