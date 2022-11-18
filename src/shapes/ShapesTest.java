package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable box1 = new Rectangle(5, 4);
        System.out.println("Perimeter of Rectangle: " + box1.getPerimeter());
        System.out.println("Area of Rectangle: " + box1.getArea());

        Measurable box2 = new Square(5);
        System.out.println("Perimeter of Square: " + box2.getPerimeter());
        System.out.println("Area of Square: " + box2.getArea());
    }
}
