package lr4.timus;

import java.util.Scanner;

public class task_1005 {
    static int minDiff = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] stones = new int[n];
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            stones[i] = scanner.nextInt();
            totalSum += stones[i];
        }

        findMinDifference(stones, 0, 0, totalSum);
        System.out.println(minDiff);
    }

    static void findMinDifference(int[] stones, int index, int currentSum, int totalSum) {
        if (index == stones.length) {
            int diff = Math.abs((totalSum - currentSum) - currentSum);
            if (diff < minDiff) {
                minDiff = diff;
            }
            return;
        }

        findMinDifference(stones, index + 1, currentSum + stones[index], totalSum);
        findMinDifference(stones, index + 1, currentSum, totalSum);
    }
}