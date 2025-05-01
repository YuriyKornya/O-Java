package Lab10.task5;

public class WasherDryer extends Appliance implements Washable, Dryable{
    @Override
    void turnOn () {
        System.out.println("Пральна машина " + getBrand() + " увімкнена");
    }

    @Override
    public void wash () {
        System.out.println("Прання запущенно...");
    }

    @Override
    public void dry () {
        System.out.println("Сушіння запущенно...");
    }
}
