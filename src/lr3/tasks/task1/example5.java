package lr3.tasks.task1;

public class example5 {
    public static void main(String[] args) {
        System.out.println("Вычисление fact(5):");
        int result = fact(5);
        System.out.println("\nРезультат: " + result);
    }

    public static int fact(int n) {
        System.out.print("fact(" + n + ") -> ");

        if (n == 0) {
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            System.out.println("fact(" + (n-2) + ") + fact(" + (n-1) + ")");
            int left = fact(n - 2);
            int right = fact(n - 1);
            return left + right;
        }
    }
}