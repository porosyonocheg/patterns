package behavioral.state;

/** Реализация паттерна Состояние на примере изменений состояний состояний писателя.
 * @author Сергей Шершавин*/

public class OneDayOfTheLifeOfTheWriter {
    public static void main(String[] args) {
        Human joe = new Human("Joe", "i'm joe. i'm 30 years old and i'm a writer.i don't like write anything but i have to do it!");
        for (int i = 0; i < 5; i++) joe.write();
    }
}
