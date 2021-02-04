package behavioral.mediator;

/**Реализация компонента банковской системы - расчётный счёт в банке
 * @author Сергей Шершавин*/

public class PaymentAccount extends MoneyHolder {

    public PaymentAccount(BankSystem bankSystem, double amount, int id) {
        super(bankSystem, amount, id);
    }

}
