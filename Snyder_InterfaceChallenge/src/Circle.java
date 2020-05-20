import processing.core.PApplet;

public class Circle extends Shape {

    private double radius;


    public Circle(Point center, PApplet p, double radius) {
        super(center, p);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}