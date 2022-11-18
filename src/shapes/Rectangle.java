package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    // Constructor (from Quadrilateral.java)
    public Rectangle(int myLength, int myWidth) {
        super(myLength, myWidth);
    }


    // Getters (from Measurable.java)
    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }


    // Setters (from Quadrilateral.java)
    @Override
    public void setLength(int newLength) {}
    @Override
    public void setWidth(int newWidth) {}


//    protected int length;
//    protected int width;
//
//    // Main
//    public static void main(String[] args) {
//        Rectangle myRectangle = new Rectangle(4, 2);
//        System.out.println(myRectangle.getArea());
//        System.out.println(myRectangle.getPerimeter());
//    }
//
//    // Constructor
//    public Rectangle(int myLength, int myWidth) {
//        this.length = myLength;
//        this.width = myWidth;
//    }
//
//    // Length Getter & Setter
//    public int getLength() {
//        return length;
//    }
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    // Width Getter & Setter
//    public int getWidth() {
//        return width;
//    }
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    // Area Calculator
//    public int getArea() {
//        return this.length * this.width;
//    }
//
//    // Perimeter Calculator
//    public int getPerimeter() {
//        return (this.length * 2) + (this.width * 2);
//    }
}
