package behavioral.strategy;

/** Реализация конкретного контекста питания.
 * @author Сергей Шершавин*/

public class Cake extends Food {
    @Override
    public void eat() {
        System.out.print("Я ем торт");
        strategyOfEating.eat();
    }
}
