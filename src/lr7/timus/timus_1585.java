package lr7.timus;

import java.util.Scanner;

public class timus_1585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int emperor = 0;
        int little = 0;
        int macaroni = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            if (line.equals("Emperor Penguin")) {
                emperor++;
            } else if (line.equals("Little Penguin")) {
                little++;
            } else if (line.equals("Macaroni Penguin")) {
                macaroni++;
            }
        }

        scanner.close();

        if (emperor > little && emperor > macaroni) {
            System.out.println("Emperor Penguin");
        } else if (little > emperor && little > macaroni) {
            System.out.println("Little Penguin");
        } else {
            System.out.println("Macaroni Penguin");
        }
    }
}
