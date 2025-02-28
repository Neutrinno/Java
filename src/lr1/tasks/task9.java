package lr1.tasks;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();
        in.nextLine();

        int number_plus = number + 1;
        int number_minus = number - 1;
        double square = Math.sqrt(number_plus + number_minus + number);

        System.out.printf("%d %d %d %f \n", number, number_minus, number_plus, square);
    }
}