import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    //you'll need a structure to hold many shapes
    Shape bigCircle;
    Shape bigRectangle;
    Shape smallCircle;
    Shape bigCircle2;
    Shape bigCircle3;
    ArrayList<Shape> shapes = new ArrayList<>();



    public void settings() {
        size(800,600);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture

        bigRectangle = new Rectangle(new Point(200,200), this, 400, 200);
        smallCircle = new Circle(new Point(400,300), this, 50);
        bigCircle = new Circle(new Point(400,300), this, 100);
        bigCircle2 = new Circle(new Point(400,300), this, 200);
        bigCircle3 = new Circle(new Point(400,300), this, 400);

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

        for(int i = 0; i < shapes.size(); i++) {
            shapes.get(i).draw();
        }





    }

}