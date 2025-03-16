package lr2.tasks.task9;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Square square = new Square(11);
        Triangle triangle = new Triangle(4, 7, 10);

        System.out.println("Круг:");
        circle.printRadius();
        System.out.println("Площадь круга: " + circle.getArea());
        System.out.println("Периметр круга: " + circle.getPerimeter());

        System.out.println("\nКвадрат:");
        square.printSide();
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Периметр квадрата: " + square.getPerimeter());

        System.out.println("\nТреугольник:");
        triangle.printSides();
        System.out.println("Площадь треугольника: " + triangle.getArea());
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
    }
}
