package structural.decorator;

/** Базовый декоратор, содержит обёртываемый объект.
 * @author Сергей Шершавин*/

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
