package lr7.tasks.task4;

import java.io.*;

public class task4 {
    public static void main(String[] args) {

        String sourceFilePath = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\tasks\\input";
        String destinationFilePath = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\tasks\\output";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Файл успешно скопирован!");
            System.out.println("Результат записан в: " + destinationFilePath);

        } catch (FileNotFoundException e) {
            System.err.println("Ошибка: исходный файл не найден!");
        } catch (IOException e) {
            System.err.println("Ошибка при копировании: " + e.getMessage());
        }
    }
}