package lr1.tasks;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = in.nextLine();

        System.out.println("Input year of your birthday: ");
        int date_of_age = in.nextInt();
        int age = 2025 - date_of_age;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        in.close();
    }
}