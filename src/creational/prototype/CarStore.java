package Prototype;

public class CarStore {
    public static void main(String[] args) {
        Car car = new Car("red", Model.BMW, 2017, 1250, 5.0f, 220, true, true, "ExtraClass", 20);
        System.out.println(car);

        System.out.println("============================================");
        CarFactory carFactory = new CarFactory(car);
        System.out.println(carFactory.cloneCar());
    }
}
