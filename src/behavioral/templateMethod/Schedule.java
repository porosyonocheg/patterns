package behavioral.templateMethod;

public abstract class Schedule {
    protected String getUpTime;
    protected String timeToGoSleep;

    protected Schedule(String getUpTime, String timeToGoSleep) {
        this.getUpTime = getUpTime;
        this.timeToGoSleep = timeToGoSleep;
    }

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
    void getUp() {
        System.out.println("Подъём в " + getUpTime);
    }
    void eat() {
        System.out.println("Приём пищи - 20 минут");
    }
    void waterProcedures() {
        System.out.println("Чистка зубов, умывание - 7 минут");

    }
    abstract void toBath();
    abstract void activity();
    abstract void haveSomeRest();
    void readBook() {
        System.out.println("Чтение книги - 40 минут");
    }
    void goToSleep() {
        System.out.println("Лечь спать не позже: " + timeToGoSleep);
    }
}
