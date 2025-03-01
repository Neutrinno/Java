package lr1.tasks;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input date: ");
        int day = in.nextInt();
        in.nextLine();

        System.out.println("Input number of month: ");
        String month = in.nextLine();

        System.out.println("Input year: ");
        int year = in.nextInt();

        System.out.printf("Today is %d %s %d \n", day, month, year);
        in.close();
    }
}