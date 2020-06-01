import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    ArrayList<Human> hA;
    Human h;


    public void settings() {
        size(800,600);
    }

    public void setup() {
        h = new Human(100, 100, this);
        hA = new ArrayList<>();
        hA.add(h);

    }

    public void draw() {
        background(0);
        stroke(255);
        strokeWeight(4);
        noFill();

        for(int i : hA) {
            hA.get(i).draw();
            hA.get(i).update();
        }
    }

}