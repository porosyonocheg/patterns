package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class RussianBankSystem implements BankSystem {
    private List<MoneyHolder> clients = new ArrayList<>();
    private final double commission = 0.02;

    public void addClient(MoneyHolder moneyHolder) {
        if (moneyHolder instanceof Cash) {
            System.out.println("We cannot add cash-client in our system. You can create account of another types");
            return;
        }
        clients.add(moneyHolder);
    }

    @Override
    public void sendMoney(int amount, MoneyHolder sender, int receiver) {
        double balance = sender.getAmount() - amount;
        if (sender instanceof CreditCard) {
            if (balance - amount * ((CreditCard) sender).getPercent() / 100.0 < ((CreditCard) sender).getLimit()) {
                System.out.println(sender.getId() + ", the amount exceeds the established limit");
                return;
            }
            balance -= amount * ((CreditCard) sender).getPercent() / 100.0;
        }
        else if (sender.getAmount() < amount) {
            System.out.println("Insufficient funds to transfer");
            return;
        }
                for (MoneyHolder mh : clients) {
                    if (mh.getId() == receiver) {
                        if (sender instanceof DebitCard && mh instanceof CheckingAccount) {
                            balance += amount * ((DebitCard) sender).getCashback() / 100.0;
                        }
                        sender.setAmount(balance);
                        if (sender instanceof Cash) {
                            double localBalance =  amount - (amount * commission);
                            mh.setAmount(mh.getAmount() + localBalance);
                            System.out.println("Cash was transferred from " + sender.getId() + " to " + mh.getId() + " in the amount of " + localBalance);
                        }
                        else {
                            mh.setAmount(mh.getAmount() + amount);
                            System.out.println("Money was transferred from " + sender.getId() + " to " + mh.getId() + " in the amount of " + amount);
                        }

                        System.out.println("New balance by " + sender.getId() + " is " + sender.getAmount());
                        System.out.println("New balance by " + mh.getId() + " is " + mh.getAmount());
                        return;
                        }
                    }
        System.out.println("Client isn't found. Check the correctness of the entered data");
    }
}
