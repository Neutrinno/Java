package lr4.examples;

public class example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (RuntimeException e) {
            System.out.println("1");
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }

}

