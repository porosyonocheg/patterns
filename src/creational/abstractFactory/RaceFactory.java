package creational.abstractFactory;

/** Общий интерфейс фабрик создания гоночных команд
 * @author Сергей Шершавин*/

public interface RaceFactory {
    Raceman getRaceman();
    Vehicle getVehicle();
    TechnicalStuff getTechnicalStuff();
}
