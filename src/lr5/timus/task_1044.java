package lr5.timus;

import java.util.Scanner;

public class task_1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int half = N / 2;
        int maxSum = 9 * half;

        long[] counts = new long[maxSum + 1];

        for (int i = 0; i <= 9; i++) {
            counts[i] = 1;
        }

        for (int digit = 2; digit <= half; digit++) {
            long[] newCounts = new long[maxSum + 1];
            for (int sum = 0; sum <= maxSum; sum++) {
                if (counts[sum] == 0) continue;
                for (int d = 0; d <= 9; d++) {
                    if (sum + d <= maxSum) {
                        newCounts[sum + d] += counts[sum];
                    }
                }
            }
            counts = newCounts;
        }

        long total = 0;
        for (int sum = 0; sum <= maxSum; sum++) {
            total += counts[sum] * counts[sum];
        }

        System.out.println(total);
    }
}