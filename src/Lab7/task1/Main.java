package Lab7.task1;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("N234521", 1000.0);

        System.out.println("Поточний баланс: " + account.getBalance());

        account.deposit(500);
        System.out.println("Баланс після поповнення: " + account.getBalance());

        account.withdraw(300);
        System.out.println("Баланс після зняття: " + account.getBalance());

        account.withdraw(1500);
        System.out.println("Баланс після невдалої спроби зняття: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("Баланс після спроби встановити негативний баланс: " + account.getBalance());
    }
}
