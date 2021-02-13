package creational.abstractFactory.driveTeam;

import creational.abstractFactory.Vehicle;

/** Модель гоночного автомобиля
 * @author Сергей Шершавин*/

public class Car implements Vehicle {
    String model;
    Car() {
        switch((int) (Math.random() * 4)){
            case 0: model = "Ferrari"; break;
            case 1: model = "Mercedes"; break;
            case 2: model = "BMW"; break;
            case 3: model = "Honda"; break;
            case 4: model = "Toyota"; break;
        }
    }
    @Override
    public void move() {
        System.out.println(this + " поехал!");
    }

    @Override
    public String toString() {
        return "автомобиль модели " + model;
    }
}
