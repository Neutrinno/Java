package lr2.tasks.task5;

public class task5 {
    static class Rectangle {
        private int length;
        private int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }

        public int getArea() {
            return length * width;
        }

        public int getPerimeter() {
            return 2 * length + 2 * width;
        }
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 5);
        System.out.printf("Значения параметров: длина = %s, ширина = %s%n", rectangle.getLength(), rectangle.getWidth());
        System.out.println("Площадь: " + rectangle.getArea());

        rectangle.setLength(10);
        System.out.printf("Значения новых параметров: длина = %s, ширина = %s%n", rectangle.getLength(), rectangle.getWidth());
        System.out.println("Периметр: " + rectangle.getPerimeter());
    }
}