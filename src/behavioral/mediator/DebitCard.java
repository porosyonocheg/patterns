package behavioral.mediator;

/**Реализация компонента банковской системы - дебетовая карта
 * @author Сергей Шершавин*/

public class DebitCard extends MoneyHolder {
    private int cashback;

/**Конструктор содержит вызов конструктора базового класса {@link MoneyHolder}, а так же
 * @param cashback - установленный процент возврата части использованных средств клиенту*/

    public DebitCard(BankSystem bankSystem, double amount, int id, int cashback) {
        super(bankSystem, amount, id);
        this.cashback = cashback;
    }

    public int getCashback() {
        return cashback;
    }
}
