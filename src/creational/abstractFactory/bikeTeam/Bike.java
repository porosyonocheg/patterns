package creational.abstractFactory.bikeTeam;

import creational.abstractFactory.Vehicle;

/** Модель велосипеда
 * @author Сергей Шершавин*/

public class Bike implements Vehicle {
    String brand;
    Bike() {
        char[] chars = new char[3];
        for (int i = 0; i < 3; i++) {
            chars[i] = (char) (Math.random() * 26 + 'A');
        }
        brand = String.valueOf(chars);
    }
    @Override
    public void move() {
        System.out.println(this + " поехал!");
    }
    @Override
    public String toString() {
        return "велосипед марки " + brand;
    }
}
