package lr5.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Введите минимальное значение:");
        int minValue = scanner.nextInt();

        List<Integer> filteredNumbers = filterByValue(numbers, minValue);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа больше " + minValue + ": " + filteredNumbers);
    }

    public static List<Integer> filterByValue(List<Integer> list, int minValue) {
        return list.stream()
                .filter(x -> x > minValue)
                .collect(Collectors.toList());
    }
}