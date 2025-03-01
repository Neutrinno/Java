package lr1.tasks;

import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input your age: ");
        int age = in.nextInt();

        int year_of_birthday = 2025 - age;
        System.out.println("Your year of birthday is: " + year_of_birthday);
        in.close();
    }
}
