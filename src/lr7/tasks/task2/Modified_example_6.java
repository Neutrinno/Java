package lr7.tasks.task2;

import java.io.*;

public class Modified_example_6 {
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\input.txt";
        String outputFileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\example_6\\output_created.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printer = new PrintWriter(outputFileName, "UTF-8")) {

            System.out.println("Текст, записываемый в файл:");
            System.out.println(" ");

            String line;
            while ((line = reader.readLine()) != null) {
                String upperLine = line.toUpperCase();

                System.out.println(upperLine);

                printer.println(upperLine);
            }

            System.out.println(" ");
            System.out.println("Файл успешно создан и заполнен: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка при создании файла: " + e.getMessage());
        }
    }
}