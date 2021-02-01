package behavioral.templateMethod;

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
        System.out.println("Hurrah! It's holidays!");
        schedule = new Holidays();
        schedule.templateMethod();
    }
}
