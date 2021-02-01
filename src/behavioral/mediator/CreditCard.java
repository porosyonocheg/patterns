package behavioral.mediator;

public class CreditCard extends MoneyHolder {
    private int limit;
    private int percent;

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
