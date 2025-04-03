package Lab4.task11;

public class Main {
    public static void main (String[] args) {
        findMax(10, 4, 25, 20, 33);
    }

    static void findMax(int... numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Максимальне число: " + max);
    }
}
