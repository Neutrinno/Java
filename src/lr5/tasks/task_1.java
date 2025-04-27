package lr5.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите массив:");
        String input = scanner.nextLine();
        int[] numbers = Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] evenNumbers = filterEvenNumbers(numbers);

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Чётные числа: " + Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr)
                .filter(x -> x % 2 == 0)
                .toArray();
    }
}