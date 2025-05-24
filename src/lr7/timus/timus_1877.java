package lr7.timus;

import java.util.Scanner;

public class timus_1877 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lock1 = scanner.nextLine();
        String lock2 = scanner.nextLine();
        scanner.close();

        for (int attempt = 0; attempt < 10000; attempt++) {
            String code = String.format("%04d", attempt);

            boolean isLock1 = (attempt % 2 == 0);
            String currentLock = isLock1 ? lock1 : lock2;
            if (code.equals(currentLock)) {
                System.out.println("yes");
                return;
            }
        }

        System.out.println("no");
    }
}

