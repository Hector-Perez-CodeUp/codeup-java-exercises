package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    // Main
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(4, 2);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());
    }

    // Constructor
    public Rectangle(int myLength, int myWidth) {
        this.length = myLength;
        this.width = myWidth;
    }

    // Length Getter & Setter
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    // Width Getter & Setter
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    // Area Calculator
    public int getArea() {
        return this.length * this.width;
    }

    // Perimeter Calculator
    public int getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }
}
