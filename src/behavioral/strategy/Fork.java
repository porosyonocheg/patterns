package behavioral.strategy;

/** Реализация конкретной стратегии питания - поедание с помощью вилки.
 * @author Сергей Шершавин*/

public class Fork implements StrategyOfEating {
    @Override
    public void eat() {
        System.out.println(" вилкой...");
    }
}
