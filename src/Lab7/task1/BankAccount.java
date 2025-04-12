package Lab7.task1;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Помилка: баланс не може бути меншим 0");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        if (newBalance >= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("Помилка: баланс не може бути меншим 0");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Помилка: сума поповнення повинна бути більшою за 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Помилка: недостатньо коштів або неправильна сума зняття");
        }
    }
}
