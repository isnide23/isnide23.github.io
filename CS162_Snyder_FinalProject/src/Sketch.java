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
    ArrayList<Particle> humans = new ArrayList<>();
    ArrayList<Particle> zombies = new ArrayList<>();
    ParticleSystem humansP = new ParticleSystem(350, 100, this);
    ParticleSystem zombiesP = new ParticleSystem(350, 400, this);



    public void settings() {
        size(800,600);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture

        bigRectangle = new Rectangle(new Point(200,200), this, 400, 200);
        Shape bigRectangle2 = new Rectangle(new Point(200,100), this, 400, 400);
        smallCircle = new Circle(new Point(400,300), this, 50);
        bigCircle = new Circle(new Point(400,300), this, 100);
        bigCircle2 = new Circle(new Point(400,300), this, 200);
        bigCircle3 = new Circle(new Point(400,300), this, 400);

        shapes.add(bigCircle);
        shapes.add(bigRectangle);
        shapes.add(smallCircle);
        shapes.add(bigCircle2);
        shapes.add(bigCircle3);
        shapes.add(bigRectangle2);

        //particles below

        Particle prtx = new Particle(350, 50, this);
        Particle prtx2 = new Particle(400, 50, this);
        Particle prtx3 = new Particle(450, 50, this);

        Particle prtx4 = new Particle(350, 550, this);
        Particle prtx5 = new Particle(400, 550, this);
        Particle prtx6 = new Particle(450, 550, this);

        humans.add(prtx);
        humans.add(prtx2);
        humans.add(prtx3);

        zombies.add(prtx4);
        zombies.add(prtx5);
        zombies.add(prtx6);



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
        /**for(int i = 0; i < humans.size(); i++) {
            humans.get(i).draw();
        }
        for(int i = 0; i < zombies.size(); i++) {
            zombies.get(i).draw();
        }
*/
        humansP.draw();
        zombiesP.draw();
        humansP.updateDown();
        zombiesP.updateUp();




    }

}