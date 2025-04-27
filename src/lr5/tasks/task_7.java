package lr5.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String input = scanner.nextLine();
        List<String> strings = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        System.out.println("Введите минимальную длину строки:");
        int minLength = scanner.nextInt();

        List<String> filteredStrings = filterByLength(strings, minLength);


        System.out.println("Исходный список: " + strings);
        System.out.println("Строки длиной больше " + minLength + ": " + filteredStrings);
    }

    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() >= minLength)
                .collect(Collectors.toList());
    }
}