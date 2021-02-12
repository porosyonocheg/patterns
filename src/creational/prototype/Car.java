package creational.prototype;

/** Конкретный прототип - легковой автомобиль.
 * @author Сергей Шершавин*/

public class Car extends Vehicle {
    String name;
    int trunkVolume;

    /**Конструктор содержит дополнительные параметры в сравнение с базовым классом:
     * @param name - название
     * @param trunkVolume - объём багажника*/

    public Car(String color, Model model, int year, int weight, float engineVolume, int enginePower, boolean isAutomaticTransmission, boolean isLeftHandDrive, String name, int trunkVolume) {
        super();
        this.color = color;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.isAutomaticTransmission = isAutomaticTransmission;
        this.isLeftHandDrive = isLeftHandDrive;
        this.name = name;
        this.trunkVolume = trunkVolume;
    }

    public Car(Car car) {
        super(car);
        this.name = car.name;
        this.trunkVolume = car.trunkVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", trunkVolume=" + trunkVolume +
                ", color='" + color + '\'' +
                ", model=" + model +
                ", year=" + year +
                ", weight=" + weight +
                ", engineVolume=" + engineVolume +
                ", enginePower=" + enginePower +
                ", isAutomaticTransmission=" + isAutomaticTransmission +
                ", isLeftHandDrive=" + isLeftHandDrive +
                '}';
    }

    @Override
    protected Vehicle clone() {
        return new Car(this);
    }
}
