package behavioral.mediator;

/** Общий интерфейс посредника - банковской системы
 * @author Сергей Шершавин*/

public interface BankSystem {
    void sendMoney(int amount, MoneyHolder sender, int receiver);
    void addClient(MoneyHolder moneyHolder);
}
