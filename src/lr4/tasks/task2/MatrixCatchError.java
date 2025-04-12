package lr4.tasks.task2;

import java.util.Scanner;

public class MatrixCatchError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try {
            System.out.print("Введите номер столбца: ");
            String input = scanner.nextLine();


            int column = Integer.parseInt(input);

            for (int[] into : matrix) {
                System.out.println(into[column]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка ввода: нужно ввести целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбца с таким номером не существует.");
        } catch (Exception e) {
            System.out.println("Непредвиденная ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершила выполнение.");
        }
    }
}

