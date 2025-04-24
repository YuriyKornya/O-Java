package Lab8.task2;

public class Car extends Vehicle{
    public Car() {
        this.speed = 0;
    }

    void accelerate () {
        speed += 30;
        System.out.println("Швидкість після прискорення: " + speed);
    }

}
