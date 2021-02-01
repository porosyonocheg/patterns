package behavioral.strategy;

public class Fork implements StrategyOfEating {
    @Override
    public void eat() {
        System.out.println(" вилкой...");
    }
}
