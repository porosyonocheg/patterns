package behavioral.observer;

/** Реализация текстового подписчика событий на железнодорожной станции. Вывод текстового уведомления
 * при получении информации со станции.
 * @author Сергей Шершавин*/

public class TextObserver implements Subscriber {

/**Принимает:
 * @param time - время, оставшееся до прибытия поезда
 * @param people - процент заполненности прибывающего состава
 * @param theMostFreePlace - наиболее свободное место на платформе*/

    @Override
    public void getEvent(int time, int people, TheMostFreePlace theMostFreePlace) {
        if (time == 0) System.out.println("The train has arrived!");
        else if (theMostFreePlace == null) System.out.println("Time until arrival: " + time + " minutes. \n The fullness of the arrived train: " + people + "%.");
        else System.out.println("Time until arrival: " + time + "minutes. \n The fullness of the arrived train: " + people + "%. \n The most free place on the platform is " + theMostFreePlace);
    }
}
