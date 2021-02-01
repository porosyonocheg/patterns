package structural.facade;

public class SocialMedia {
    void promote(String name, int money) {
        for (int i = 0; i < money/10; i++) {
            System.out.println("Новый шедевр музыкального искусства! Не пропустите премьеру " + name + " на всех доступных площадках!");
            try {
                Thread.sleep(money*20);
            } catch (InterruptedException e) {}
        }
    }
}
