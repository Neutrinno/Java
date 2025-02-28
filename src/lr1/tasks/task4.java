package lr1.tasks;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of month: ");
        String month = in.nextLine();

        System.out.println("Input count of day: ");
        int year = in.nextInt();

        System.out.printf("%s has %d days \n", month, year);
    }
}