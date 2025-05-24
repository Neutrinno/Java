package lr7.examples.example_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class example_2 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\bsr\\IdeaProjects\\Java\\src\\lr7\\examples\\example_file.txt";
        String data = "Привет, мир!";

        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            byte[] buffer = new byte[1000];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer, 0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}