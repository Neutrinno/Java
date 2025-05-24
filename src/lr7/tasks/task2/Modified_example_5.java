package lr7.tasks.task2;

import java.io.*;

public class Modified_example_5{
    public static void main(String[] args) {
        String inputFileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\input.txt";
        String outputFileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\output.txt";

        try (InputStream inputStream = new FileInputStream(inputFileName);
             InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             OutputStream outputStream = new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
             BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter)) {

            System.out.println("Содержимое исходного файла (" + inputFileName + "):");
            System.out.println(" ");

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }

            System.out.println(" ");
            System.out.println("Данные успешно записаны в файл: " + outputFileName);

        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}