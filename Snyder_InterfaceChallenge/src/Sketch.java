import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    //you'll need a structure to hold many shapes
    /**DrawEllipse e;
    DrawEllipse x;
    DrawRectangle r;
     */
    Shape bigCircle;
    Shape bigRectangle;
    Shape smallCircle;
    ArrayList<Shape> shapes = new ArrayList<>();
    //int[] nums = {20, 30, 40, 50, 40, 30, 20};


    public void settings() {
        size(800,600);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture
        bigCircle = new Circle(new Point(200,200), this, 100);
        bigRectangle = new Rectangle(new Point(200,200), this, 200, 200);
        smallCircle = new Circle(new Point(200,200), this, 50);
        shapes.add(bigCircle);
        shapes.add(bigRectangle);
        shapes.add(smallCircle);

        /**e = new DrawEllipse(this);
        x = new DrawEllipse(this);
        r = new DrawRectangle(this);
        shapes.add(e);
        shapes.add(x);
        shapes.add(r);
        */



    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        //ellipse(300,100,80,80);
        //rect(100,100,200,150);
        background(0);
        stroke(255);
        strokeWeight(4);
        noFill();

        shapes.get(0).draw();
        shapes.get(1).draw();
        shapes.get(2).draw();
        //e.draw();

        /**for(int i = 0; i < nums.length; i++ ) {
            nums[i] = int(random(10,100));
        }
         */
        /**for (int i = 0; i < nums.length; i++) {
            ellipse(i*100+100, 200, nums[i], nums[i]);
            ellipse(i*100+100, 300, nums[i], nums[i]);
            rect(i*100+100, 100, nums[i], nums[i]);
         }
        */



    }

}