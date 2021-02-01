package behavioral.observer;

public class TrainsTracking {
    public static void main(String[] args) {
        RailwayStation railwayStation = new RailwayStation();
        railwayStation.addSubscriber(new VoiceObserver());
        railwayStation.addSubscriber(new TextObserver());
        railwayStation.startTimer(20);
    }
}
