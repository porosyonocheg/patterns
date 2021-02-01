package structural.facade;

public class Editing {
    void cut(int money) {
        System.out.println("Обрезаем, склеиваем видеоряд...");
        System.out.println("Цветокоррекция. Синхронизуем звуковую дорожку...");
        try {
            Thread.sleep(money*20);
        } catch (InterruptedException e) {}
        System.out.println("Монтаж клипа завершён!");
    }
}
