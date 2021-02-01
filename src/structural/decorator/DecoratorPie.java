package structural.decorator;

public class DecoratorPie implements Pie {
    Pie pie;
    DecoratorPie (Pie pie) {
        this.pie = pie;
    }

    @Override
    public String bake() {
        return pie.bake();
    }
}
