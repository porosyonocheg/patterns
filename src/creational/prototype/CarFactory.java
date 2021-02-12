package creational.prototype;

/** Фабрика легковых машин содержит метод создания клонов экземпляров, делегирующий работу методу клонирования класса {@link Car}
 * В общем случае может содержать дополнительную бизнес-логику.
 * @author Сергей Шершавин*/

public class CarFactory {
    Car car;

    public CarFactory(Car car) {
        this.car = car;
    }
    Car cloneCar() {
        return (Car) car.clone();
    }
}
