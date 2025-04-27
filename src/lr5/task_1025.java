package lr5;

import java.util.Arrays;
import java.util.Scanner;

public class task_1025  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int[] group = new int[K];

        for (int i = 0; i < K; i++) {
            group[i] = scanner.nextInt();
        }

        Arrays.sort(group);

        int min = 0;
        int neededGroups = (K / 2) + 1;

        for (int i = 0; i < neededGroups; i++) {
            min += (group[i] / 2) + 1;
        }

        System.out.println(min);
    }
}