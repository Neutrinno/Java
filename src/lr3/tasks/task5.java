package lr3.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class task5 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Арбуз");
        map.put(1, "Подсолнух");
        map.put(2, "Луна");
        map.put(3, "Телескоп");
        map.put(4, "Дождь");
        map.put(5, "Вертолет");
        map.put(6, "Море");
        map.put(7, "Библиотека");
        map.put(8, "Снег");
        map.put(9, "Электричество");
        map.put(10, "Ветер");


        System.out.println("\nСтроки с ключом > 5:");
        map.entrySet().stream()
                .filter(entry -> entry.getKey() > 5)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        System.out.println("\nСтроки с ключом 0:");
        String zeroValues = map.entrySet().stream()
                .filter(entry -> entry.getKey() == 0)
                .map(Map.Entry::getValue)
                .collect(Collectors.joining(", "));
        System.out.println(zeroValues);

        System.out.println("\nПеремножение ключей, где длина строки > 5:");
        long product = map.entrySet().stream()
                .filter(entry -> entry.getValue().length() > 5)
                .mapToLong(Map.Entry::getKey)
                .reduce(1, (a, b) -> a * b);
        System.out.println("Результат: " + product);
    }
}