package Lab6.task3;

public class Main {
    public static void main (String[] args) {
        Animal homeAnimal = new Animal();
        homeAnimal.name = "Грін";
        homeAnimal.sound = "гав-гав";
        homeAnimal.makeSound();

        Animal unknownAnimal = new Animal();
        unknownAnimal.name = "Елвіс";
        unknownAnimal.sound = "мяу";
        unknownAnimal.makeSound();

        Animal streetAnimal = new Animal();
        streetAnimal.name = "Гектор";
        streetAnimal.sound = "гав";
        streetAnimal.makeSound();

        Animal [] arrAnimal = {
            homeAnimal, unknownAnimal, streetAnimal
        };
        for (Animal array : arrAnimal) {
            array.makeSound();
        }

    }
}
