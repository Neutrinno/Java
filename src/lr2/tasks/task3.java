package lr2.tasks;


import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите текст для шифрования");
        String text = scanner.nextLine();


        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        scanner.nextLine();


        String encryptedText = encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText);


        while (true) {
            System.out.println("Выполнить обратное преобразование? (y/n)");
            String answer = scanner.nextLine();

            if (answer.equals("y")) {
                String decryptedText = encrypt(encryptedText, -key);
                System.out.println("Текст после обратного преобразования: " + decryptedText);
                break;
            } else if (answer.equals("n")) {
                System.out.println("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }

        scanner.close();
    }


    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char shifted = (char) (((ch - base + key) % 26 + 26) % 26 + base);
                result.append(shifted);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}