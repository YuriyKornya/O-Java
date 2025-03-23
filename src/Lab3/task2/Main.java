package Lab3.task2;

import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Вгадай число: ");
            num = scanner.nextInt();
        }
        while (num != 3);
        System.out.println("Ви вгадали! Число: " + num);


        scanner.close();
    }
}
