package lr3.timus;

import java.util.Scanner;

public class task_2142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long C = scanner.nextLong();

        long X = scanner.nextLong();
        long Y = scanner.nextLong();
        long Z = scanner.nextLong();

        if (A + B + C >= X + Y + Z &&
                A + C >= X &&
                B + C >= Y) {
            System.out.println("It is a kind of magic");
        } else {
            System.out.println("There are no miracles in life");
        }
    }
}