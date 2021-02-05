package behavioral.observer;

/** Реализация голосового подписчика событий на железнодорожной станции. Моделируется вывод голосового уведомления
 * при получении информации со станции.
 * @author Сергей Шершавин*/

public class VoiceObserver implements Subscriber {

    /**Принимает:
     * @param time - время, оставшееся до прибытия поезда
     * @param people - процент заполненности прибывающего состава
     * @param theMostFreePlace - наиболее свободное место на платформе*/

    @Override
    public void getEvent(int time, int people, TheMostFreePlace theMostFreePlace) {
        if (time == 0) System.out.println("*голос произносит* : 'Внимание, поезд прибыл на платформу!'");
        else if (theMostFreePlace == null) System.out.println("*голос произносит* : 'До отправления поезда осталось: " + time + " минут. Заполненность прибывающего состава: " + people + " процентов.'");
        else System.out.println("*голос произносит* : 'До отправления поезда осталось: " + time + " минут. Заполненность прибывающего состава: " + people + " процентов. Наиболее свободное место: " + theMostFreePlace.part + ".'");
    }
}
