package Lab4.task9;

public class Main {
    public static void main (String [] args) {
        sum(1,4,6);
    }
    public static void sum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Сума: " + total);
    }
}
