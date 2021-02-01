package behavioral.templateMethod;

public class Holidays extends Schedule {
    protected Holidays() {
        super("в любое время :)", "любого времени :)");
    }

    @Override
    void toBath() {
        System.out.println("Приём душа - 15 минут");
    }

    @Override
    void activity() {
        System.out.println("Отправляемся путешествовать, исследовать новые локации! - полный день");
    }

    @Override
    void haveSomeRest() {
    }
}
