package behavioral.mediator;

/**Реализация компонента банковской системы - кредитная карта
 * @author Сергей Шершавин*/

public class CreditCard extends MoneyHolder {
    private int limit;
    private int percent;

/**Конструктор содержит вызов конструктора базового класса {@link MoneyHolder}, а так же
 * @param limit - предел денежных средств доступных для использования
 * @param percent - установленный процент, изымаемый системой за пользование средствами*/

    public CreditCard(BankSystem bankSystem, double amount, int id, int limit, int percent) {
        super(bankSystem, amount, id);
        this.limit = limit;
        this.percent = percent;
    }

    public int getLimit() {
        return limit;
    }

    public int getPercent() {
        return percent;
    }

}
