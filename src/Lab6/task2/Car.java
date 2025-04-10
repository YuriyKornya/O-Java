package Lab6.task2;

public class Car {
    String brand;
    String model;
    int speed;
    void accelerate (int increment) {
        speed += increment;
    }
    void printInfo () {
        System.out.println("Марка: " + brand);
        System.out.println("Модель: " + model);
        System.out.println("Швидкість: " + speed);
    }
}


