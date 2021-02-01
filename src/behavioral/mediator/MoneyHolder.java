package behavioral.mediator;

public abstract class MoneyHolder {
    protected BankSystem bankSystem;
    protected double amount;
    protected final int id;

    public MoneyHolder(BankSystem bankSystem, double amount, int id) {
        this.bankSystem = bankSystem;
        this.amount = amount;
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void send(int sum, int id) {
        bankSystem.sendMoney(sum, this, id);
    }
}
