package behavioral.strategy;

/** Реализация конкретной стратегии питания - поедание с помощью ложки.
 * @author Сергей Шершавин*/

public class Spoon implements StrategyOfEating{
    @Override
    public void eat() {
        System.out.println(" ложкой...");
    }
}
