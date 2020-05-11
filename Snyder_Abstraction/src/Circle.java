/** Represents a circle.
 * @author Ian Snyder
 */
public class Circle extends Shape  {

    private double radius;


    public Circle(Point center, double radius) {
        this.radius = radius;
        this.position = center;
        Shape.setNumShapes(getNumShapes() + 1);
    }

    @Override
    public double computeArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double computePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}