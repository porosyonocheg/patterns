package behavioral.templateMethod;

/** Базовый класс распорядка дня
 * @author Сергей Шершавин*/

public abstract class Schedule {
    protected String getUpTime;
    protected String timeToGoSleep;

/**Конструктор содержит параметры:
 *@param getUpTime - время подъёма
 *@param timeToGoSleep  - время отхода ко сну*/

    protected Schedule(String getUpTime, String timeToGoSleep) {
        this.getUpTime = getUpTime;
        this.timeToGoSleep = timeToGoSleep;
    }
/**Шаблонный метод, определяющий действия в заданном порядке*/

    final void templateMethod() {
        getUp();
        eat();
        waterProcedures();
        activity();
        eat();
        haveSomeRest();
        toBath();
        waterProcedures();
        readBook();
        goToSleep();
    }

    /**Реализация методов, одинаковых для всех наследников класса:*/
    /**Подъём*/

    void getUp() {
        System.out.println("Подъём в " + getUpTime);
    }

    /**Приём пищи*/

    void eat() {
        System.out.println("Приём пищи - 20 минут");
    }

    /**Водные процедуры*/

    void waterProcedures() {
        System.out.println("Чистка зубов, умывание - 7 минут");
    }

    /**Чтение книги*/

    void readBook() {
        System.out.println("Чтение книги - 40 минут");
    }

    /**Отход ко сну*/

    void goToSleep() {
        System.out.println("Лечь спать не позже: " + timeToGoSleep);
    }

    /**Приём ванной, активность и отдых реализованы в классах наследниках*/

    abstract void toBath();
    abstract void activity();
    abstract void haveSomeRest();
}
