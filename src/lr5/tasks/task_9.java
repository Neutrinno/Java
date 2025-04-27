package lr5.tasks;


import java.util.*;
import java.util.stream.Collectors;

public class task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String input = scanner.nextLine();

        List<String> strings = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        List<String> lettersOnlyStrings = filterLettersOnly(strings);

        System.out.println("\nИсходный список: " + strings);
        System.out.println("Строки только с буквами: " + lettersOnlyStrings);
    }

    public static List<String> filterLettersOnly(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я]+"))
                .collect(Collectors.toList());
    }
}