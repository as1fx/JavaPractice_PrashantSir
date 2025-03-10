package AbstractClass;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(10);

        System.out.printf("Circle radius : %f\nSquare side : %f ", circle.calculateArea(), square.calculateArea());
    }
}
