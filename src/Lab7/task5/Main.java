package Lab7.task5;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock(23, 59,59);

        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();
        clock.tick();
        clock.displayTime();

    }
}
