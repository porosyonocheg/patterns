package behavioral.observer;

/** Реализация паттерна Наблюдатель. Для конкретной железнодорожной станции смоделирована возможность получать
 * уведомления о событиях в двух видах: голосовых и текстовых.
 * @author Сергей Шершавин*/

public class TrainsTracking {
    public static void main(String[] args) {
        RailwayStation railwayStation = new RailwayStation();
        railwayStation.addSubscriber(new VoiceObserver());
        railwayStation.addSubscriber(new TextObserver());
        railwayStation.startTimer(5);
    }
}
