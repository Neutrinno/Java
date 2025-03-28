package lr3.timus;

import java.util.Scanner;

public class task_2138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        long v = scanner.nextLong();

        long[] digits = new long[4];

        for (int i = 0; i < 4; i++) {
            digits[i] = (v >> (8 * (3 - i))) & 0xFF;
        }

        long result;
        if (type.equals("GOOD")) {
            result = digits[3] * (1L << 24) + digits[2] * (1L << 16) + digits[1] * 256 + digits[0];
        } else {
            result = digits[0] * (1L << 24) + digits[1] * (1L << 16) + digits[2] * 256 + digits[3];
        }
        System.out.println(result);
    }
}