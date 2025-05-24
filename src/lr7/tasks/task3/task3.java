package lr7.tasks.task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task3 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\tasks\\input";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineCount = 0;

            System.out.println("Содержимое файла:");


            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }

            System.out.println("Количество строк в файле: " + lineCount);

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}