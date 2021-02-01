package behavioral.strategy;

public class Cake extends Food {
    @Override
    public void eat() {
        System.out.print("Я ем торт");
        strategyOfEating.eat();
    }
}
