package behavioral.mediator;

/** Реализация компонента банковской системы - наличные средства.
 * @author Сергей Шершавин*/

public class Cash extends MoneyHolder {

    public Cash(BankSystem bankSystem, double amount, int id) {
        super(bankSystem, amount, id);
    }
}
