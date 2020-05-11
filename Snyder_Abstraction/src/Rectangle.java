/** Represents a rectangle.
 * @author Ian Snyder
 */
public class Rectangle extends Shape {

    private double length, height;

    Rectangle(Point upperLeft, double length, double height) {
        this.position = upperLeft;
        this.length = length;
        this.height = height;
        Shape.setNumShapes(getNumShapes() + 1);
    }

    @Override
    public double computeArea() {
        return this.height * this.length;
    }

    @Override
    public double computePerimeter() {
        return (this.height * 2) + (this.length * 2);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}