package Lab6.task2;

public class Main {
    public static void main (String [] args) {
        Car car = new Car();
        car.brand = "MERCEDES";
        car.model = "CLS";
        car.speed = 120;
        car.accelerate(100);
        car.printInfo();
    }
}