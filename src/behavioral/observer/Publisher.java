package behavioral.observer;

public interface Publisher {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(int timeBeforeArrival, int fullness, TheMostFreePlace theMostFreePlace);
}
