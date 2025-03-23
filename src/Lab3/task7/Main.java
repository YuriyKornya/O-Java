package Lab3.task7;

import java.util.Arrays;
import java.util.Random;
    public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            int[] array = new int[10];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 1;
            }
            System.out.println("Масив до сортування: " + Arrays.toString(array));
            Arrays.sort(array);
            System.out.println("Відсортований масив: " + Arrays.toString(array));
          }
        }
