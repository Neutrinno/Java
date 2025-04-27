package lr5.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> squaredNumbers = squareNumbers(numbers);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Квадраты чисел: " + squaredNumbers);
    }

    public static List<Integer> squareNumbers(List<Integer> list) {
        return list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
    }
}