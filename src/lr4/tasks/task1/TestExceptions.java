package lr4.tasks.task1;

import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите целое число: ");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Среднее положительных: " + (double) sum / count);
        } else {
            System.out.println("Положительные числа отсутствуют.");
        }
    }
}
