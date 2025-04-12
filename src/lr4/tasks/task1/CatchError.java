package lr4.tasks.task1;

import java.util.Scanner;

public class CatchError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int index = 0;

        try {
            while (index < array.length) {
                System.out.print("Введите целое число: ");
                String input = scanner.nextLine();

                array[index] = Integer.parseInt(input);
                index++;
            }

            int sum = 0;
            int count = 0;
            for (int num : array) {
                if (num > 0) {
                    sum += num;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют.");
            }

            double average = (double) sum / count;
            System.out.println("Среднее положительных элементов: " + average);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: нужно ввести целое число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Логическая ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошла непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершила работу.");
        }
    }
}
