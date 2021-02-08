package behavioral.templateMethod;

/** Реализация паттерна Шаблонный метод. Составление распорядка дня в зависимости от типа дня недели (будни, выходные, отпуск)
 * @author Сергей Шершавин*/

public class ScheduleDemo {

    public static void main(String[] args) {
        Schedule schedule = new Weekdays();
        System.out.println("This is a work week:");
        schedule.templateMethod();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("The weekend is coming: ");
        schedule = new Weekend();
        schedule.templateMethod();
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Finally on vacation!");
        schedule = new Vacation();
        schedule.templateMethod();
    }
}
