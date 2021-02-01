package behavioral.mediator;
/***
 * Российская банковская система переводит средства следующим образом:
 * - за перевод наличных взымается комиссия
 * - при переводе с дебетовой карты на расчётный счёт доступен кэш-бек
 * - при переводе с кредитной карты сумма долга увеличивается на сумму перевода плюс установленный процент для данной карты
 */

public class RussianBankSystemDemo {
    public static void main(String[] args) {
        BankSystem russianBankSystem = new RussianBankSystem();
        MoneyHolder rubles = new Cash(russianBankSystem, 5000.0, 1);
        MoneyHolder creditCard = new CreditCard(russianBankSystem, -5000.0, 666, -50000, 5);
        MoneyHolder debitCard = new DebitCard(russianBankSystem, 15000.0, 999, 3);
        MoneyHolder account = new CheckingAccount(russianBankSystem, 300000.0, 22274);
        russianBankSystem.addClient(rubles);
        russianBankSystem.addClient(creditCard);
        russianBankSystem.addClient(debitCard);
        russianBankSystem.addClient(account);

        rubles.send(5000, 999); // 0 -> 19 900
        creditCard.send(40000, 22274); // -47 000 -> 340 000
        creditCard.send(2858, 999); // limit was exceeded
        creditCard.send(2857, 999); // -49 999.85 -> 22 757
        debitCard.send(20000, 22274); // 3 357 -> 360 000
        debitCard.send(3358, 666); // insufficient funds to transfer
        debitCard.send(3357, 1); // client isn't found
    }
}
