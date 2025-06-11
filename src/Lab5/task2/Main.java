package Lab5.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        while (true) {
            System.out.println("-----Банківське меню------");
            System.out.println("1 - Вивести поточний баланс.");
            System.out.println("2 - Внести кошти на рахунок.");
            System.out.println("3 - Зняти кошти з рахунку.");
            System.out.println("4 - Вихід.");
            System.out.println("Ваш вибір: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;

                case 2:
                    balance += deposit(scanner);
                    break;

                case 3:
                    balance = withdraw(scanner, balance);
                    break;

                case 4:
                    System.out.println("Дякуємо за використання програми!");
                    System.out.println("Вихід...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Невірний вибір. Спробуйте ще раз.");

            }
        }
    }

    static void showBalance(double balance) {
        System.out.println("Ваш баланс на рахунку: " + balance + " грн.");
    }

    static double deposit(Scanner scanner) {
        System.out.print("Введіть суму поповнення: ");
        double sum = scanner.nextDouble();
        if (sum > 0) {
            System.out.println("Ваш рахунок поповнено на " + sum + " грн.");
            return sum;
        } else {
            System.out.println("Невірна сума поповнення!");
            return 0;
        }
    }

    static double withdraw(Scanner scanner, double balance) {
        System.out.print("Введіть суму для зняття: ");
        double withdrawal = scanner.nextDouble();
        if (withdrawal > balance) {
            System.out.println("Недостатньо коштів на рахунку!");
            return balance;
        } else if (withdrawal <= 0) {
            System.out.println("Cума повинна бути більшою за 0.");
            return withdrawal;
        }
        else {
            System.out.println("Знято: " + withdrawal + " грн.");
            return balance - withdrawal;
        }
    }
}



