package lr2.tasks;

public class task2 {
        public static void main(String[] args) {
            int rows = 4;
            int cols = 6;


            int[][] array = new int[rows][cols];

            int value = 1;

            for (int i = 0; i < rows; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < cols; j++) {
                        array[i][j] = value++;
                    }
                } else {
                    for (int j = cols - 1; j >= 0; j--) {
                        array[i][j] = value++;
                    }
                }
            }

            System.out.println("Массив:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.printf("%3d ", array[i][j]);
                }
                System.out.println();
            }
        }
}
