package lr1.timus;

import java.util.Scanner;

public class task_1293 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int totalSulfide = 2 * N * A * B;

        System.out.println(totalSulfide);
        in.close();
    }
}
