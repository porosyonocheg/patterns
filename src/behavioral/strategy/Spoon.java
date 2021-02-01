package behavioral.strategy;

public class Spoon implements StrategyOfEating{
    @Override
    public void eat() {
        System.out.println(" ложкой...");
    }
}
