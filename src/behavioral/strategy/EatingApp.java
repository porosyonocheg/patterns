package behavioral.strategy;

public class EatingApp {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setStrategyOfEating(new Fork());
        cake.eat();
        cake.setStrategyOfEating(new Spoon());
        cake.eat();
        cake.setStrategyOfEating(new Hands());
        cake.eat();
    }
}
