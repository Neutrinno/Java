package lr1.timus;

import java.util.Scanner;

public class task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int harry = in.nextInt();
        int larry = in.nextInt();

        int total_cans = harry + larry - 1;

        int harry_missed = total_cans - harry;
        int larry_missed = total_cans - larry;

        System.out.println(harry_missed + " " + larry_missed);
        in.close();
    }
}