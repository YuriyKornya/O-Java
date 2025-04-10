package Lab6.task4;

public class StaticCounter {
    static int count = 0;

     static void increment () {
        count++;
    }

     static void getCount () {
        System.out.println("Статичний лічильник: " + count);
 }

}
