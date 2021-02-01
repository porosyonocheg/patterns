package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class RailwayStation implements Publisher {
    private volatile int timeBeforeArrival;
    private int fullness;
    private TheMostFreePlace theMostFreePlace;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void startTimer(int timeBeforeArrival) {
        this.timeBeforeArrival = timeBeforeArrival;
        while (this.timeBeforeArrival >= 0) {
            if (this.timeBeforeArrival %5 == 0 && this.timeBeforeArrival %10 != 0) notifySubscribers(this.timeBeforeArrival, fullness, theMostFreePlace);
            else if (this.timeBeforeArrival %10 == 0) setFullness();
            else if (this.timeBeforeArrival %7 == 0) setTheMostFreePlace();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
            this.timeBeforeArrival--;
        }
    }

    public void setFullness () {
        fullness = (int) (Math.random() * 100);
        notifySubscribers(timeBeforeArrival, fullness, theMostFreePlace);
    }

    public void setTheMostFreePlace() {
        int i = (int) (Math.random() * 3);
        switch (i) {
            case 0: theMostFreePlace = TheMostFreePlace.PLATFORMHEAD; break;
            case 1: theMostFreePlace = TheMostFreePlace.MIDDLE; break;
            case 2: theMostFreePlace = TheMostFreePlace.PLATFORMTAIL;
        }
        notifySubscribers(timeBeforeArrival, fullness, theMostFreePlace);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(int timeBeforeArrival, int fullness, TheMostFreePlace theMostFreePlace) {
        for (Subscriber s : subscribers) s.getEvent(timeBeforeArrival, fullness, theMostFreePlace);
    }
}
enum TheMostFreePlace {
    PLATFORMHEAD("начало платформы"), MIDDLE("середина платформы"), PLATFORMTAIL("конец платформы");
    String part;
    TheMostFreePlace(String part) {
        this.part = part;
    }
}