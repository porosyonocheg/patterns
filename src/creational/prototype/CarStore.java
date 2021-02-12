package creational.prototype;

/** Реализация паттерна Прототип. Создаём объект класса Car и с помощью фабрики объектов получаем его точную копию.
 * @author Сергей Шершавин*/

public class CarStore {
    public static void main(String[] args) {
        Car car = new Car("red", Model.BMW, 2017, 1250, 5.0f, 220, true, true, "ExtraClass", 20);
        System.out.println(car);

        System.out.println("============================================");
        CarFactory carFactory = new CarFactory(car);
        System.out.println(carFactory.cloneCar());
    }
}
