package Lab7.task3;

public class Car {
    private String brand;
    private String model;
    private int speed;

    void accelerate (int value) {
        speed+=value;
    }

    void brake (int value) {
        speed-=value;
        if (speed < 0) {
            speed = 0;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
}
