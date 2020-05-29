import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {
    ArrayList<Particle> humans = new ArrayList<>();
    ArrayList<Particle> zombies = new ArrayList<>();
    ParticleSystem humansP = new ParticleSystem(20, 100, this);
    ParticleSystem zombiesP = new ParticleSystem(20, 500, this);



    public void settings() {
        size(800,600);
    }

    public void setup() {
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
        background(0);
        stroke(255);
        strokeWeight(4);
        noFill();

        humansP.draw();
        zombiesP.draw();
        humansP.updateDown();
        zombiesP.updateUp();




    }

}