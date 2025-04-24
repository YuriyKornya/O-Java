package Lab8.task3;

public class Dog extends Mammal{
    @Override
    void makeSound (){
        System.out.println("Bark");
    }

    public Dog(String name) {
        super(name);
    }
}
