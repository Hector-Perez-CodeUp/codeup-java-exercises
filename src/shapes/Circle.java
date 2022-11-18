package shapes;

public class Circle {
    private double radius;

    public static void main(String[] args) {
        Circle myCircle = new Circle(3.14);

        System.out.println(myCircle.getRadius());
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());

        myCircle.setRadius(4);
        System.out.println(myCircle.getRadius());
        System.out.println(myCircle.getArea());
        System.out.println(myCircle.getCircumference());
    }

    // Constructor
    public Circle(double myRadius) {
        this.radius = myRadius;
    }

    // Radius Getter
    public double getRadius() {
        System.out.println("The RADIUS of your circle is: ");
        return this.radius;
    }
    // Radius Setter
    public void setRadius(int newRadius) {
        this.radius = newRadius;
    }

    // Area Calculation
    public double getArea() {
        System.out.println("The AREA of your circle is: ");
        return Math.PI*(Math.pow(this.radius, 2)); // A = PI * r^2
    }

    // Circumference Calculation
    public double getCircumference() {
        System.out.println("The CIRCUMFERENCE of your circle is: ");
        return 2 * (Math.PI * this.radius); // C = 2 * PI * r
    }
}
