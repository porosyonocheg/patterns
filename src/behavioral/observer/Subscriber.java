package behavioral.observer;

/** Общий интерфейс подписчиков на событие.
 * @author Сергей Шершавин*/

public interface Subscriber {
        void getEvent(int time, int people, TheMostFreePlace theMostFreePlace);
}
