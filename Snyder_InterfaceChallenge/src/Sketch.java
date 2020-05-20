import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    //you'll need a structure to hold many shapes
    Shape bigCircle;
    Shape bigRectangle;
    Shape smallCircle;
    ArrayList<Shape> shapes = new ArrayList<>();



    public void settings() {
        size(800,600);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture

        bigRectangle = new Rectangle(new Point(200,200), this, 200, 200);
        smallCircle = new Circle(new Point(200,200), this, 50);

        bigCircle = new Circle(new Point(200,200), this, 100);
        shapes.add(bigCircle);
        shapes.add(bigRectangle);
        shapes.add(smallCircle);

    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        background(0);
        stroke(255);
        strokeWeight(4);
        noFill();

        shapes.get(0).draw();
        shapes.get(1).draw();
        shapes.get(2).draw();





    }

}