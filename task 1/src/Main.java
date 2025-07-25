//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BankAccount accountIvanov = new BankAccount("Иванов");
        BankAccount accountPetrov = new BankAccount("Петров");

        accountPetrov.deposit(5000);
        System.out.println(accountPetrov.getBalance());

        accountPetrov.withdraw(2000);
        System.out.println(accountPetrov.getBalance());

        accountPetrov.transter(accountIvanov, 2000);
        System.out.println(accountPetrov.getBalance());
        System.out.println(accountIvanov.getBalance());
    }
}