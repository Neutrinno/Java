package lr1.tasks;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Напишите дату своего рождения: ");
    int date_of_age = in.nextInt();
    int age = 2025 - date_of_age;
    System.out.println("Вам " + age );
    }
}
