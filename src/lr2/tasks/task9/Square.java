package lr2.tasks.task9;

class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    public void printSide() {
        System.out.println("Длина стороны квадрата: " + side);
    }
}
