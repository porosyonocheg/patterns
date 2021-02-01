package structural.facade;

public class Casting {
    void selectScreenWriter(int money) {
        System.out.println("Опрос знакомых сценаристов, обсуждение возможных концепций...");
        try {
            Thread.sleep(money*20);
        } catch (InterruptedException e) {}
        System.out.println("Сценарий подобран!");
    }

    void selectActors(int money) {
        System.out.println("Ищем подходящих актёров...");
        try {
        Thread.sleep(money*20);
        } catch (InterruptedException e) {}

        System.out.println("Актёры найдены!");
    }
}
