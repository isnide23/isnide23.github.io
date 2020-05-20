import processing.core.PApplet;

public class Rectangle extends Shape  {

    private double length, height;

    Rectangle(Point upperLeft, PApplet p, double length, double height) {
        super(upperLeft, p);
        this.length = length;
        this.height = height;
    }

    public double computeArea() { return  length*height; }
    public double getPerimeter() {return 2*length + 2*height;}

}


