package structural.facade;

/** Реализация паттерна Фасад. Клипмейкерство - сложная задача, требующая комплекса разнообразных решений.
 * Создаём фасад - модель продюсера, который за нас реализует всю необходимую функциональность и вернёт нам
 * результат, исходя из исходной задачи и вложенных средств.
 * @see Producer
 * @author Сергей Шершавин*/

public class ClipMaking {
    public static void main(String[] args) {
        new Producer().createClip(new Clip("Happy New Year!", 250));
    }
}
