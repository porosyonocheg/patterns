package behavioral.mediator;

public class DebitCard extends MoneyHolder {
    private int cashback;

    public DebitCard(BankSystem bankSystem, double amount, int id, int cashback) {
        super(bankSystem, amount, id);
        this.cashback = cashback;
    }

    public int getCashback() {
        return cashback;
    }
}
