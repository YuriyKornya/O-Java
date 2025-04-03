package Lab4.task7;

public class Main {
    static int counter;
    public static void main (String [] args) {
        increment();
        increment();
        increment();
        System.out.println("Counter: " + counter);

    }
    public static void increment () {
        counter++;
    }
}
