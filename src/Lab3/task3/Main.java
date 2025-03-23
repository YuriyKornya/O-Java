package Lab3.task3;

public class Main {
    public static void main(String[] args) {

        System.out.println("Цикл for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 * " + i + " = " + (7 * i));
        }

        System.out.println("\nЦикл while:");
        int i = 1;
        while (i <= 10) {
            System.out.println("7 * " + i + " = " + (7 * i));
            i++;
        }

        System.out.println("\nЦикл do-while:");
        i = 1;
        do {
            System.out.println("7 * " + i + " = " + (7 * i));
            i++;
        } while (i <= 10);
    }
}

