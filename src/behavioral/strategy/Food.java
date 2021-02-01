package behavioral.strategy;

public abstract class Food {
    protected StrategyOfEating strategyOfEating;
    public void setStrategyOfEating (StrategyOfEating strategyOfEating) {
        this.strategyOfEating = strategyOfEating;
    }

    public abstract void eat();
}
