package behavioral.templateMethod;

public class Weekend extends Schedule {
    protected Weekend() {
        super("9:00", "01:30");
    }

    @Override
    void toBath() {
        System.out.println("Прием ванны - 1 час");
    }

    @Override
    void activity() {
        System.out.println("Прогулка в парке - 2 часа");
        System.out.println("Поход на концерт - 2,5 часа");
    }

    @Override
    void haveSomeRest() {
        System.out.println("Сёрфинг соцсетей - 2 часа");
    }
}
