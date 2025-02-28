package lr1.tasks;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int first_number = in.nextInt();
        in.nextLine();

        System.out.println("Input second number: ");
        int second_number = in.nextInt();

        int sum = first_number + second_number;

        System.out.println("The sum is: " + sum);
    }
}