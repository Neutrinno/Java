package lr2.timus;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class task_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> matches = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String sequence = scanner.nextLine();
            matches.add(sequence);
        }

        String letter = scanner.nextLine();

        ArrayList<String> result = new ArrayList<>();

        for (String sequence : matches) {
            if (sequence.startsWith(letter)) {
                result.add(sequence);
            }
        }

        Collections.sort(result);

        for (String match : result) {
            System.out.println(match);
        }
    }
}
