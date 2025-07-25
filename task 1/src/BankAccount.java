import java.time.LocalDateTime;

public class BankAccount{
    private String clientName; //имя владельца
    private int balance; //баланс
    private LocalDateTime openingDate; //дата открытия
    private boolean isBlockedAccount; //заблокирован ли счет

    BankAccount(String clientName) {
        this.clientName = clientName;
        balance = 0;
        openingDate = LocalDateTime.now();
        isBlockedAccount = false;
    }

    // пополнение счета
    public boolean deposit(int amount) {
        if (isBlockedAccount || amount <= 0) {
            return false;
        }
        balance += amount;
        System.out.println("Счет был пополнен");
        return true;
    }

    //снятие денег
    public boolean withdraw(int amount) {
        if (balance < amount || isBlockedAccount || amount <= 0) {
             return false;
        }
        balance -= amount;
        System.out.println("Было выполнено снятие денег со счета");
        return true;
    }

    // перевод на другой счет
    public boolean transter(BankAccount otherAccount, int amount) {
        if (balance < amount || isBlockedAccount || otherAccount.isBlockedAccount || amount <= 0) {
            return false;
        }
        balance -= amount;
        otherAccount.balance += amount;
        System.out.println("Был выполнен перевод на другой счет");
        return true;
    }

    public String getClientName() {
        return clientName;
    }

    public int getBalance() {
        return balance;
    }

    public LocalDateTime getOpeningDate() {
        return openingDate;
    }

    public boolean isBlockedAccount() {
        return isBlockedAccount;
    }
}