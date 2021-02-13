package creational.abstractFactory;

import creational.abstractFactory.bikeTeam.BikeTeamFactory;
import creational.abstractFactory.driveTeam.DriveTeamFactory;
import creational.abstractFactory.horseTeam.HorseTeamFactory;

import java.util.ArrayList;
import java.util.List;

/** Реализация паттерна Абстрактная фабрика. Представляет собой моделирование гоночных соревнований различных типов:
 * - гонки на велосипеде
 * - скачки на лошадях
 * - гонки на автомобилях
 * Посредством фабрик соответствующих типов создаём 5 команд для каждого типа соревнования, каждая из которых содержит:
 * - гонщика
 * - средство передвижения
 * - механика
 * Заносим всех в общий список, и последовательно выполняем методы каждого участника каждой команды в каждой гонке,
 * используя общий интерфейс.
 * @author Сергей Шершавин*/

public class BigRaceDay {
    public static void main(String[] args) {
        System.out.println("Races is starting...");
        RaceFactory biking = new BikeTeamFactory();
        RaceFactory horsing = new HorseTeamFactory();
        RaceFactory driving = new DriveTeamFactory();
        List<Raceman> racemans = new ArrayList<>();
        List<Vehicle> vehicles = new ArrayList<>();
        List<TechnicalStuff> stuff = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            racemans.add(biking.getRaceman());
            racemans.add(horsing.getRaceman());
            racemans.add(driving.getRaceman());
            vehicles.add(biking.getVehicle());
            vehicles.add(horsing.getVehicle());
            vehicles.add(driving.getVehicle());
            stuff.add(biking.getTechnicalStuff());
            stuff.add(horsing.getTechnicalStuff());
            stuff.add(driving.getTechnicalStuff());
        }

        for (int i = 0; i < 15; i++) {
        racemans.get(i).toRace(vehicles.get(i));
        vehicles.get(i).move();
        stuff.get(i).repare();
        }
        System.out.println("Races are over");
    }

}
