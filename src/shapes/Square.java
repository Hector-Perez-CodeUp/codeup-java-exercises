package shapes;

public class Square extends Quadrilateral {
    public int side;

    // Constructor
    public Square(int mySide) {
        super(mySide, mySide);
    }

    // Getters
    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }
    @Override
    public double getArea() {
        return this.length * this.width;
    }

    // Setters
    @Override
    public void setLength(int newLength) {

    }
    @Override
    public void setWidth(int newWidth) {

    }


//    public int side;
//
//    // Constructor
//    public Square(int mySide) {
//        super(mySide, mySide);
//        this.side = mySide;
//    }
//
//    // Override Area Calc
//    public int getArea() {
//        return (int)Math.pow(side, 2);
//    }
//
//    // Override Perimeter Calc
//    public int getPerimeter() {
//        return 4 * side;
//    }
}
