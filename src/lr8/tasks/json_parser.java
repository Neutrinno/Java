package lr8.tasks;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.Iterator;
import java.util.Scanner;

public class json_parser {
    private static final String FILE_PATH = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr8\\tasks\\products.json";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить продукт");
            System.out.println("2. Поиск по категории");
            System.out.println("3. Удалить продукт по названию");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> addProduct(scanner);
                case "2" -> searchByCategory(scanner);
                case "3" -> deleteProduct(scanner);
                case "4" -> System.exit(0);
                default -> System.out.println("Неверный выбор!");
            }
        }
    }

    private static JSONArray loadProducts() {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            JSONParser parser = new JSONParser();
            return (JSONArray) parser.parse(reader);
        } catch (Exception e) {
            return new JSONArray();
        }
    }

    private static void saveProducts(JSONArray products) {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(products.toJSONString());
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении файла: " + e.getMessage());
        }
    }

    private static void addProduct(Scanner scanner) {
        JSONArray products = loadProducts();

        System.out.print("Название: ");
        String name = scanner.nextLine();
        System.out.print("Категория: ");
        String category = scanner.nextLine();
        System.out.print("Цена: ");
        String price = scanner.nextLine();
        System.out.print("Количество: ");
        String quantity = scanner.nextLine();

        JSONObject product = new JSONObject();
        product.put("name", name);
        product.put("category", category);
        product.put("price", price);
        product.put("quantity", quantity);

        products.add(product);
        saveProducts(products);
        System.out.println("Продукт добавлен!");
    }

    private static void searchByCategory(Scanner scanner) {
        JSONArray products = loadProducts();

        System.out.print("Введите категорию: ");
        String category = scanner.nextLine();

        boolean found = false;
        for (Object obj : products) {
            if (obj instanceof JSONObject product) {
                String cat = (String) product.get("category");
                if (category.equalsIgnoreCase(cat)) {
                    printProduct(product);
                    found = true;
                }
            }
        }

        if (!found) System.out.println("Продукты не найдены.");
    }

    private static void deleteProduct(Scanner scanner) {
        JSONArray products = loadProducts();

        System.out.print("Введите название продукта для удаления: ");
        String target = scanner.nextLine();

        Iterator<Object> iterator = products.iterator();
        boolean deleted = false;

        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj instanceof JSONObject product) {
                String name = (String) product.get("name");
                if (target.equalsIgnoreCase(name)) {
                    iterator.remove();
                    deleted = true;
                    break;
                }
            }
        }

        if (deleted) {
            saveProducts(products);
            System.out.println("Продукт удалён.");
        } else {
            System.out.println("Продукт не найден.");
        }
    }

    private static void printProduct(JSONObject product) {
        System.out.println("Название: " + product.get("name"));
        System.out.println("Категория: " + product.get("category"));
        System.out.println("Цена: " + product.get("price"));
        System.out.println("Количество: " + product.get("quantity"));
        System.out.println();
    }
}
