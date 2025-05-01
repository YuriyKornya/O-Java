package Lab10.task5;

public class Main {
    public static void main(String[] args) {
        WasherDryer washerDryer = new WasherDryer();
        washerDryer.brand = "Samsung";
        washerDryer.turnOn();
        washerDryer.wash();
        washerDryer.dry();
    }
}
