package Lab6.task4;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.increment();
        counter1.getCount();

        Counter counter2 = new Counter();
        counter2.increment();
        counter2.getCount();

        StaticCounter.increment();
        StaticCounter.getCount();

    }
}