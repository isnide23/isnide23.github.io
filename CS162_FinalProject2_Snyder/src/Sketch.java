import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    int hPop = 10;
    int zPop = 3;

    ArrayList<Human> hA;
    ArrayList<ZombieTwo> zTwoA;




    public void settings() {
        size(800,600);
    }

    public void setup() {
        //h = new Human(100, 100, this);
        hA = new ArrayList<>();
        zTwoA = new ArrayList<>();
        for (int i = 0; i < hPop; i++) {
            hA.add(new Human(i * 100, 100, this));
        }


        for (int i = 0; i < zPop; i++) {
            zTwoA.add(new ZombieTwo(i * 100, 500, this));
        }




    }

    public void draw() {
        background(0);
        stroke(255);
        strokeWeight(4);
        noFill();

        text("Human population: " + hPop , 350, 30);
        text("Zombie population: " + zPop , 350, 570);

        for(int i = 0; i < hA.size(); i++) {
            hA.get(i).draw();
            hA.get(i).update();
            hA.get(i).colDet(hA.get(i));

        }

        for(int i = 0; i < zTwoA.size(); i++) {
            zTwoA.get(i).draw();
            zTwoA.get(i).update();
            zTwoA.get(i).colDet(zTwoA.get(i));

        }



    }

}