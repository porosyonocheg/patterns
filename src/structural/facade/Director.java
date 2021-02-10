package structural.facade;

/**Модель режиссёра клипа
 * @author Сергей Шершавин*/

public class Director {

    /**Моделирование съёмочного процесса клипа*/

    void makeClip(int money) {
        System.out.println("Начинаем съёмки! Тишина, камера, мотор!");
        try {
            Thread.sleep(money*20);
        } catch (InterruptedException e) {}
        System.out.println("Съёмки закончены! Спасибо за работу!");
    }

}
