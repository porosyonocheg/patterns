package structural.decorator;

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
