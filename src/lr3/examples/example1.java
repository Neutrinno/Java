package lr3.examples;

public class example1 {
    public static void m(int x) {
        System.out.println("x=" + x);
        if ((2 * x + 1) < 100) {
            m(2 * x + 1);
        }
    }

    public static void main(String[] args) {
        m(5);
    }
}