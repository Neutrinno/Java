package lr6.timus;

import java.util.HashMap;
import java.util.Scanner;

public class task_2023 {
    public static void main(String[] args) {
        HashMap<String, Integer> addressToLocker = new HashMap<>();

        String[] locker1 = {"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phocbus", "Ralph", "Robin"};
        for (String name : locker1) {
            addressToLocker.put(name, 1);
        }

        String[] locker2 = {"Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"};
        for (String name : locker2) {
            addressToLocker.put(name, 2);
        }

        String[] locker3 = {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"};
        for (String name : locker3) {
            addressToLocker.put(name, 3);
        }

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 

        int currentLocker = 1;
        int totalSteps = 0;

        for (int i = 0; i < n; i++) {
            String recipient = scanner.nextLine();
            int targetLocker = addressToLocker.get(recipient);
            totalSteps += Math.abs(targetLocker - currentLocker); 
            currentLocker = targetLocker; 
        }

        System.out.println(totalSteps);
    }
}