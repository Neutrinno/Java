package lr3.tasks.task1;

public class example2 {
    public static void m(int x) {
        if ((2 * x + 1) < 100) {
            m(2 * x + 1);
        }
        System.out.println("x=" + x);
    }

    public static void main(String[] args) {
        m(5);
    }
}