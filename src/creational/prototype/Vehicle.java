package creational.prototype;

/** Базовый прототип средства передвижения
 * @author Сергей Шершавин*/

public abstract class Vehicle {
    String color;
    Model model;
    int year;
    int weight;
    float engineVolume;
    int enginePower;
    boolean isAutomaticTransmission;
    boolean isLeftHandDrive;

/**Конструктор создания прототипа содержит объявление полей:
 * color  - цвет
 * model - марка средства передвижения (завод изготовитель)
 * year - год выпуска
 * weight - вес
 * engineVolume - объём двигателя
 * enginePower - мощность двигателя
 * isAutomaticTransmission - наличие автоматической коробки передач
 * isLeftHandDrive - леворульность средства*/

    public Vehicle(Vehicle vehicle) {
        this.color = vehicle.color;
        this.model = vehicle.model;
        this.year = vehicle.year;
        this.weight = vehicle.weight;
        this.engineVolume = vehicle.engineVolume;
        this.enginePower = vehicle.enginePower;
        this.isAutomaticTransmission = vehicle.isAutomaticTransmission;
        this.isLeftHandDrive = vehicle.isLeftHandDrive;
    }

    public Vehicle() {
    }

    protected abstract Vehicle clone();
}
