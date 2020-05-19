import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    //you'll need a structure to hold many shapes
    Shape shape;
    PApplet p;
    ArrayList<Shape> shapes = new ArrayList<>();


    public void settings() {
        size(500,500);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture
        shape = new Circle(new Point(200.0, 200.0), 50.0);
    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        ellipse(300,100,80,80);
        rect(100,100,200,150);

    }

}