package lr2.timus;

import java.util.Scanner;

public class task_2056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int sum = 0;
        boolean hasThree = false;
        boolean allFive = true;

        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();
            sum += grade;

            if (grade == 3) {
                hasThree = true;
            }
            if (grade != 5) {
                allFive = false;
            }
        }

        double average = (double) sum / n;

        if (hasThree) {
            System.out.println("None");
        } else if (allFive) {
            System.out.println("Named");
        } else if (average >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
