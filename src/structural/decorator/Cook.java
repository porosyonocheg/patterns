package structural.decorator;

/** Реализация паттерна Декоратор. Получаем базовый компонент, компоненты на его основе и используем общий интерфейс.
 * Каждый новый компонент вносит определенную дополнительную функциональность к своим прародителям, имея возможность
 * также использовать методы базовых классов.
 * @author Сергей Шершавин*/

public class Cook {
    public static void main(String[] args) {
        Pie pie = new Biscuit();
        System.out.println(pie.bake());

        Pie pie1 = new NutsPie(pie);
        System.out.println(pie1.bake());

        Pie pie2 = new Cake(pie1);
        System.out.println(pie2.bake());
    }
}
