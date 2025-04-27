package lr5.tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый массив:");
        int[] arr1 = readIntArray(scanner);

        System.out.println("Введите второй массив:");
        int[] arr2 = readIntArray(scanner);

        int[] commonElements = findCommonElements(arr1, arr2);

        System.out.println("Первый массив: " + Arrays.toString(arr1));
        System.out.println("Второй массив: " + Arrays.toString(arr2));
        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }

    public static int[] readIntArray(Scanner scanner) {
        String input = scanner.nextLine();
        return Arrays.stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    public static int[] findCommonElements(int[] arr1, int[] arr2) {
        Set<Integer> set = Arrays.stream(arr2).boxed().collect(Collectors.toSet());
        return Arrays.stream(arr1)
                .filter(set::contains)
                .toArray();
    }
}