package Lab5.task7;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;

        System.out.println("\uD83C\uDFB0 Вітаємо у грі сло-машина!");
        System.out.println("Правила:");
        System.out.println("1. Ваша мета — виграти, збираючи однакові символи.");
        System.out.println("2. Початковий баланс: 100 грн.");
        System.out.println("3. Можливі символи: 🍒 🍋 🍑 🏆 ⚓");
        System.out.println("--------------------------------------------------");

        while (true) {
            System.out.println("Ваш баланс: " + balance + " грн.");
            System.out.print("Введіть розмір ставки:");
            bet = scanner.nextInt();
            if (bet <= 0) {
                System.out.println("Введіть суму більше 0!");
                continue;
            } else if (bet > balance) {
                System.out.println("Ставка не може бути більше балансу!");
                continue;
            } else {
                balance -= bet;
                System.out.println("Ставку прийнято!");
            }
            String row[] = spinRow();
            printRow(row);

            payout = getPayout(row, bet);
            if (payout > 0) {
                balance += payout;
                System.out.println("Ви виграли: " + payout + " грн!");
            } else {
                System.out.println("Нічого не випало. Спробуйте ще раз.");
            }

            if (balance == 0) {
                System.out.println("Ваш баланс 0 грн. Гра завершена!");
                break;
            }

            scanner.nextLine();

            String answer;
            while (true) {
                System.out.print("Грати ще? (Y/N): ");
                answer = scanner.next();

                if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Будь ласка, введіть Y або N.");
                }
            }

            if (answer.equalsIgnoreCase("N")) {
                System.out.println("Дякуємо за гру! Ваш остаточний баланс: " + balance + " грн.");
                break;
            }

            if (balance <= 0) {
                System.out.println("Баланс вичерпано! Гра завершена.");
                break;
            }
        }
        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = {"🍒", "🍋", "🍑", "🏆", "⚓" };
        Random random = new Random();
        String[] row = new String[3];
        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println("******************************");
        System.out.println(" " + row[0] + " | " + row[1] + " | " + row[2]);
        System.out.println("******************************");
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return bet * getMultiplier(row[0], 3);
        } else if ((row[0].equals(row[1]) || row[0].equals(row[2]) || row[1].equals(row[2]))) {
            String symbolForTwo = null;
            if (row[0].equals(row[1])) symbolForTwo = row[0];
            else if (row[0].equals(row[2])) symbolForTwo = row[0];
            else symbolForTwo = row[1];
            return bet * getMultiplier(symbolForTwo, 2);
        }
        return 0;
    }

    static int getMultiplier(String symbol, int matchCount) {
        if (matchCount == 3) {
            switch (symbol) {
                case "🍒":
                    return 3;
                case "🍋":
                    return 4;
                case "🍑":
                    return 5;
                case "🏆":
                    return 10;
                case "⚓":
                    return 100;
                default:
                    return 0;
            }
        } else if (matchCount == 2) {
            switch (symbol) {
                case "🍒":
                    return 2;
                case "🍋":
                    return 3;
                case "🍑":
                    return 4;
                case "🏆":
                    return 5;
                case "⚓":
                    return 6;
                default:
                    return 0;
            }
        }
        return 0;
    }
}


