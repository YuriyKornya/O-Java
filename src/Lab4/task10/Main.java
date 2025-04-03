package Lab4.task10;

public class Main {
    public static void main (String[] args) {
        printNumbers("Hello, World!",1,5,10);
    }
    static void printNumbers(String message, int... numbers) {
        System.out.println(message);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
