package lr7.examples.example_6;

import java.io.*;

public class example_6 {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\input.txt";
        String outputFileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\example_6\\output_created.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printer = new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = reader.readLine()) != null) {
                printer.println(line.toUpperCase());
            }

            System.out.println("Файл успешно создан и заполнен.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}