package behavioral.iterator;

/**Общий интерфейс коллекций определяет фабричный метод производства итераторов
 * @author Сергей Шершавин*/

public interface PersonTree {
    PersonIterator getPersonIterator();
}
