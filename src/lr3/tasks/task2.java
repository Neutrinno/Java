package lr3.tasks;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Число должно быть неотрицательным!");
        } else {
            System.out.print("Двоичное представление: ");
            decimalToBinary(number);
        }
    }

    public static void decimalToBinary(int n) {
        if (n < 2) {
            System.out.print(n);
            return;
        }

        decimalToBinary(n / 2);
        System.out.print(n % 2);
    }
}