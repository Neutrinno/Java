package lr2.timus;

import java.util.HashSet;
import java.util.Scanner;

public class task_1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> visitedShops = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < N; i++) {
            String shopName = scanner.nextLine();

            if (visitedShops.contains(shopName)) {
                bayanCount++;
            } else {
                visitedShops.add(shopName);
            }
        }

        System.out.println(bayanCount);
    }
}