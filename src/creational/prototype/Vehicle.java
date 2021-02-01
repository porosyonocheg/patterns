package creational.prototype;

public abstract class Vehicle {
    String color;
    Model model;
    int year;
    int weight;
    float engineVolume;
    int enginePower;
    boolean isAutomaticTransmission;
    boolean isLeftHandDrive;

    public Vehicle(String color, Model model, int year, int weight, float engineVolume, int enginePower, boolean isAutomaticTransmission, boolean isLeftHandDrive) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.engineVolume = engineVolume;
        this.enginePower = enginePower;
        this.isAutomaticTransmission = isAutomaticTransmission;
        this.isLeftHandDrive = isLeftHandDrive;
    }

    protected abstract Vehicle clone();
}
