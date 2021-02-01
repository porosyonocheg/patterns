package behavioral.strategy;

public class Hands implements StrategyOfEating {
    @Override
    public void eat() {
        System.out.println(" руками...");
    }
}
