package lr2.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task1 {
        public static void main(String[] args) {

            int[] array = new int[10];
            Random random = new Random();

            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);
            }

            System.out.print("Массив: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();


            int minValue = array[0];
            for (int num : array) {
                if (num < minValue) {
                    minValue = num;
                }
            }

            List<Integer> minIndices = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == minValue) {
                    minIndices.add(i);
                }
            }

            System.out.println("Минимальное значение: " + minValue);
            System.out.print("Индексы минимального значения: ");
            for (int index : minIndices) {
                System.out.print(index + " ");
            }
        }

}