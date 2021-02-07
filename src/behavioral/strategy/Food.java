package behavioral.strategy;

/** Общий интерфейс контекстов питания, к которым могут быть применены стратегии поедания.
 * @author Сергей Шершавин*/

public abstract class Food {
    protected StrategyOfEating strategyOfEating;
    public void setStrategyOfEating (StrategyOfEating strategyOfEating) {
        this.strategyOfEating = strategyOfEating;
    }

    public abstract void eat();
}
