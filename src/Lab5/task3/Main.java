package Lab5.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;
        boolean validOperation = true;


        System.out.print("Введіть 1 число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введіть оператор: ");
        operator = scanner.next().charAt(0);

        System.out.print("Введіть 2 число: ");
        num2 = scanner.nextDouble();


        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Ділення на нуль неможливе!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;

            case '^':
                result = Math.pow(num1, num2);
                break;

            default:
                System.out.println("Помилка: некоректний оператор!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}


