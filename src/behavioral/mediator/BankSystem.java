package behavioral.mediator;

public interface BankSystem {
    void sendMoney(int amount, MoneyHolder sender, int receiver);
    void addClient(MoneyHolder moneyHolder);
}
