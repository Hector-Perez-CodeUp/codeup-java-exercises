package shapes;

public class Square extends Rectangle {
    public int side;

    // Constructor
    public Square(int mySide) {
        super(mySide, mySide);
        this.side = mySide;
    }

    // Override Area Calc
    public int getArea() {
        return (int)Math.pow(side, 2);
    }

    // Override Perimeter Calc
    public int getPerimeter() {
        return 4 * side;
    }
}
