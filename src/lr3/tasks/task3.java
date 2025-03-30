package lr3.tasks;

import java.util.Scanner;

public class task3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        inputArrayRecursive(array, 0);

        System.out.println("Введенный массив:");
        printArrayRecursive(array, 0);
    }

    public static void inputArrayRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            return;
        }
        System.out.print("Элемент " + (index + 1) + ": ");
        arr[index] = scanner.nextInt();
        inputArrayRecursive(arr, index + 1);
    }

    public static void printArrayRecursive(int[] arr, int index) {
        if (index >= arr.length) {
            System.out.println();
            return;
        }
        System.out.print(arr[index] + " ");
        printArrayRecursive(arr, index + 1);
    }
}