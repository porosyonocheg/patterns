package creational.prototype;

public class Car extends Vehicle {
    String name;
    int trunkVolume;
    public Car(String color, Model model, int year, int weight, float engineVolume, int enginePower, boolean isAutomaticTransmission, boolean isLeftHandDrive, String name, int trunkVolume) {
        super(color, model, year, weight, engineVolume, enginePower, isAutomaticTransmission, isLeftHandDrive);
        this.name = name;
        this.trunkVolume = trunkVolume;
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
        return new Car(color, model, year, weight, engineVolume, enginePower, isAutomaticTransmission, isLeftHandDrive, name, trunkVolume);
    }
}
