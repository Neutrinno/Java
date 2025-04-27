package lr5.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String input = scanner.nextLine();
        List<String> strings = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        System.out.println("Введите подстроку для фильтрации:");
        String substring = scanner.nextLine().trim();

        List<String> filteredStrings = filterBySubstring(strings, substring);

        System.out.println("Исходный список: " + strings);
        System.out.println("Строки, содержащие '" + substring + "': " + filteredStrings);
    }

    public static List<String> filterBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}