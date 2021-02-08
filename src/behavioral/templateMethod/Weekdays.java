package behavioral.templateMethod;

/**Реализация распорядка дня в будни
 * @author Сергей Шершавин*/

public class Weekdays extends  Schedule {
    protected Weekdays() {
        super("7:00", "23:30");
    }

    @Override
    void toBath() {
        System.out.println("Лёгкий душ - 10 минут");
    }

    @Override
    void activity() {
        System.out.println("Работа - с 9 до 18");
    }

    @Override
    void haveSomeRest() {
        System.out.println("Сёрфинг соцсетей - 1 час");
        System.out.println("Просмотр фильма - 2 часа");
    }
}
