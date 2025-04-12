package Lab7.task3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford","Mustang",100);
        car.accelerate(50);
        car.brake(20);

        System.out.println("Марка: " + car.getBrand());
        System.out.println("Модель: " + car.getModel());
        System.out.println("Швидкість: " + car.getSpeed());
    }
}
