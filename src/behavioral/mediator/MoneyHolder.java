package behavioral.mediator;

/**Данный класс - абстрактный компонент банковской системы.
 * @author Сергей Шершавин*/

public abstract class MoneyHolder {
    protected BankSystem bankSystem;
    protected double amount;
    protected final int id;

/**Конструктор содержит:
 * @param bankSystem - банковская система, к которой относится компонент
 * @param amount - сумма денежных средств, составляющая компонент
 * @param id - идентификационный номер компонента*/

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
/**Отправка денежных средств осуществляется посредством бановской системы, к которой принадлежит компонент
 * @param sum - отправляемая сумма денежных средств
 * @param  id - идентификационный номер получателя денежных средств*/
    public void send(int sum, int id) {
        bankSystem.sendMoney(sum, this, id);
    }
}
