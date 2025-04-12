package lr4.tasks.task3;

import java.util.Scanner;

public class ArrayCatchError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] array = new byte[5];
        int sum = 0;

        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Введите значение: ");
                String input = scanner.nextLine();

                byte value = Byte.parseByte(input);
                array[i] = value;
            }

            for (byte b : array) {
                sum += b;
            }

            System.out.println("Сумма элементов: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: введите целое число в диапазоне от -128 до 127.");
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершила выполнение.");
        }
    }
}
