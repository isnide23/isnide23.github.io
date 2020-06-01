import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    int pop = 10;

    ArrayList<Human> hA;
    ArrayList<Zombie> zA;




    public void settings() {
        size(800,600);
    }

    public void setup() {
        //h = new Human(100, 100, this);
        hA = new ArrayList<>();
        zA = new ArrayList<>();
        for (int i = 0; i < pop; i++) {
            hA.add(new Human(i * 100, 100, this));
            zA.add(new Zombie(i * 100, 550, this));
        }


    }

    public void draw() {
        background(0);
        stroke(255);
        strokeWeight(4);
        noFill();

        for(int i = 0; i < hA.size(); i++) {
            hA.get(i).draw();
            hA.get(i).update();
            zA.get(i).draw();
            zA.get(i).update();
        }
    }

}