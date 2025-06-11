package Lab5.task4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Кількість кубиків для кидання: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Кількість повинна бути більше 0!");
            return;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            int roll = random.nextInt(6) + 1;
            sum += roll;
            print(roll);
        }

        System.out.println("Загальна сума: " + sum);
        scanner.close();
    }

        static void print(int roll) {
            switch (roll) {
                case 1:
                    System.out.println("+-------+");
                    System.out.println("|       |");
                    System.out.println("|   *   |");
                    System.out.println("|       |");
                    System.out.println("+-------+");
                    break;


                case 2:
                    System.out.println("+-------+");
                    System.out.println("| *     |");
                    System.out.println("|       |");
                    System.out.println("|     * |");
                    System.out.println("+-------+");
                    break;

                case 3:
                    System.out.println("+-------+");
                    System.out.println("| *     |");
                    System.out.println("|   *   |");
                    System.out.println("|     * |");
                    System.out.println("+-------+");
                    break;

                case 4:
                    System.out.println("+-------+");
                    System.out.println("| *   * |");
                    System.out.println("|       |");
                    System.out.println("| *   * |");
                    System.out.println("+-------+");
                    break;

                case 5:
                    System.out.println("+-------+");
                    System.out.println("| *   * |");
                    System.out.println("|   *   |");
                    System.out.println("| *   * |");
                    System.out.println("+--------+");
                    break;

                case 6:
                    System.out.println("+------+");
                    System.out.println("| *  * |");
                    System.out.println("| *  * |");
                    System.out.println("| *  * |");
                    System.out.println("+------+");
                    break;
               }
          }
    }

