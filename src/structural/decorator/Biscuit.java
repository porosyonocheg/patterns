package structural.decorator;

public class Biscuit implements Pie {
    @Override
    public String bake() {
        return "Бисквитное тесто запекается в духовке при t = 180 С в течение 40 минут. ";
    }
}
