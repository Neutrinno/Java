package lr6.tasks;

public class task4 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Поток " + threadNumber);
            });
            thread.start();
        }
    }
}