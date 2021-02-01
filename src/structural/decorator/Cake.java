package structural.decorator;

public class Cake extends DecoratorPie  {
    Cake(Pie pie) {
        super(pie);
    }

    String makeDecor() {
        return "Покрываем остывший пирог кремом, посыпаем кокосовой стружкой, украшаем верх кремом из кондитерского мешка.";
    }
    @Override
    public String bake() {
        return super.bake() + makeDecor();
    }
}
