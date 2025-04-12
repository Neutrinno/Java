package lr4.tasks.task3;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte[] array = new byte[5];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите число: ");
            array[i] = Byte.parseByte(scanner.nextLine());
        }

        int sum = 0;
        for (byte b : array) {
            sum += b;
        }

        System.out.println("Сумма: " + sum);
    }
}
