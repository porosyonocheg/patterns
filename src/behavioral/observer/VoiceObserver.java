package behavioral.observer;

public class VoiceObserver implements Subscriber {

    @Override
    public void getEvent(int time, int people, TheMostFreePlace theMostFreePlace) {
        if (time == 0) System.out.println("*голос произносит* : 'Внимание, поезд прибыл на платформу!'");
        else if (theMostFreePlace == null) System.out.println("*голос произносит* : 'До отправления поезда осталось: " + time + " минут. Заполненность прибывающего состава: " + people + " процентов.'");
        else System.out.println("*голос произносит* : 'До отправления поезда осталось: " + time + " минут. Заполненность прибывающего состава: " + people + " процентов. Наиболее свободное место: " + theMostFreePlace.part + ".'");
    }
}
