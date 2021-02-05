package behavioral.observer;

/** Общий интерфейс классов-издателей. Имеет методы добавления, удаления новых подписчиков и их уведомления о событии
 * @author Сергей Шершавин*/

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(int timeBeforeArrival, int fullness, TheMostFreePlace theMostFreePlace);
}
