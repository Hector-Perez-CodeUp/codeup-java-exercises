package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;


    // Constructor
    public Quadrilateral(int myLength, int myWidth) {
        this.length = myLength;
        this.width = myWidth;
    }

    // Getters
    public int getLength() {
        return this.length;
    }
    public int getWidth() {
        return this.width;
    }

    // Setters
    public abstract void setLength(int newLength);
    public abstract void setWidth(int newWidth);
}
