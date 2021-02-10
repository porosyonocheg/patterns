package structural.decorator;

/** Ореховый пирог - обёртка {@link Biscuit}, дополненная методом внедрения орехов в тесто mixNuts().
 * @author Сергей Шершавин*/

public class NutsPie extends DecoratorPie {
    NutsPie(Pie pie) {
        super(pie);
    }

    String mixNuts() {
        return "Замешиваем в бисквитное тесто раздробленные ядра грецких орехов. ";
    }

    @Override
    public String bake() {
        return mixNuts() + super.bake();
    }
}
