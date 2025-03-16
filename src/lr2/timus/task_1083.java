package lr2.timus;

import java.util.Scanner;

public class task_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String exclamations = scanner.next();
        int k = exclamations.length();

        long result = calculateMultiFactorial(n, k);

        System.out.println(result);
    }

    public static long calculateMultiFactorial(int n, int k) {
        long result = 1;
        int current = n;

        if (n % k == 0) {
            while (current >= k) {
                result *= current;
                current -= k;
            }
        }

        else {
            while (current >= n % k) {
                result *= current;
                current -= k;
            }
        }
        return result;
    }
}




