package lr5.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class task_6  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Введите делитель:");
        int divisor = scanner.nextInt();

        List<Integer> filteredNumbers = filterByDivisor(numbers, divisor);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Числа, делящиеся на " + divisor + ": " + filteredNumbers);
    }

    public static List<Integer> filterByDivisor(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}