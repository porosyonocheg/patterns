package structural.decorator;

/** Торт - обёртка для {@link NutsPie}, реализует дополнительный метод декорирования makeDecor().
 * @author Сергей Шершавин*/

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
