package behavioral.observer;

public class TextObserver implements Subscriber {

    @Override
    public void getEvent(int time, int people, TheMostFreePlace theMostFreePlace) {
        if (time == 0) System.out.println("The train has arrived!");
        else if (theMostFreePlace == null) System.out.println("Time until arrival: " + time + "minutes. \n The fullness of the arrived train: " + people + "%.");
        else System.out.println("Time until arrival: " + time + "minutes. \n The fullness of the arrived train: " + people + "%. \n The most free place on the platform is " + theMostFreePlace);
    }
}
