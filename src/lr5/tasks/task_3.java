package lr5.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String input = scanner.nextLine();
        List<String> strings = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        List<String> filteredStrings = filterUppercaseStrings(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки с заглавной буквы: " + filteredStrings);
    }

    public static List<String> filterUppercaseStrings(List<String> list) {
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}