package behavioral.strategy;

/** Реализация конкретной стратегии питания - поедание с помощью рук.
 * @author Сергей Шершавин*/

public class Hands implements StrategyOfEating {
    @Override
    public void eat() {
        System.out.println(" руками...");
    }
}
