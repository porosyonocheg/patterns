package structural.facade;

/** Модель кастинга.
 * @author Сергей Шершавин*/

public class Casting {

    /**Подбор вомзожного сценария клипа в зависимости от финансовых возможностей заказчика*/

    void selectScreenWriter(int money) {
        System.out.println("Опрос знакомых сценаристов, обсуждение возможных концепций...");
        try {
            Thread.sleep(money*20);
        } catch (InterruptedException e) {}
        System.out.println("Сценарий подобран!");
    }

    /**Подбор актёрского состава для клипа, исходя из финансовых возможностей заказчика*/

    void selectActors(int money) {
        System.out.println("Ищем подходящих актёров...");
        try {
        Thread.sleep(money*20);
        } catch (InterruptedException e) {}

        System.out.println("Актёры найдены!");
    }
}
