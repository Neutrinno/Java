package lr8.tasks;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class parser_excel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите путь к Excel файлу (например, C:\\Users\\bsr\\IdeaProjects\\Java\\example_excel.xlsx) или 'exit' для выхода: ");
            String filePath = scanner.nextLine();

            if ("exit".equalsIgnoreCase(filePath)) {
                System.out.println("Завершение программы.");
                break;
            }

            try (FileInputStream inputStream = new FileInputStream(filePath);
                 Workbook workbook = new XSSFWorkbook(inputStream)) {

                if (workbook.getNumberOfSheets() == 0) {
                    System.err.println("В файле отсутствуют листы. Проверьте содержимое файла.");
                    continue;
                }

                Sheet sheet = workbook.getSheetAt(0);
                if (sheet == null) {
                    System.err.println("Первый лист не найден в файле. Возможно, файл поврежден.");
                    continue;
                }

                System.out.println("Чтение данных из листа: " + sheet.getSheetName());

                for (Row row : sheet) {
                    for (Cell cell : row) {
                        System.out.print(cell.toString() + "\t");
                    }
                    System.out.println();
                }

                break;

            } catch (IOException e) {
                System.err.println("Ошибка при чтении файла: " + e.getMessage());
                System.err.println("Проверьте правильность пути к файлу и его доступность.");
            } catch (Exception e) {
                System.err.println("Произошла неожиданная ошибка: " + e.getMessage());
                e.printStackTrace();
            }

            System.out.println("Попробуйте ввести путь снова или введите 'exit' для выхода.");
        }

        scanner.close();
    }
}
