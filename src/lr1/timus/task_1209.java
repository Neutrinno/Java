package lr1.timus;

import java.util.Scanner;

public class task_1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int f = in.nextInt();
        int totalTime = 60 + (12 - f) * 45;

        if (totalTime <= 300) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

         in.close();
    }
}
