import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {

    final int hPop = 5;
    final int zPop = 5;
    int hPopDisplay = hPop;
    int zPopDisplay = zPop;
    ArrayList<Humanoid> hA;
    ArrayList<Zombie> zA;

    public void settings() {
        size(800,600);
    }

    public void setup() {
        //h = new Human(100, 100, this);
        hA = new ArrayList<>();
        zA = new ArrayList<>();
        for (int i = 0; i < hPop; i++) {
            hA.add(new Humanoid(i * 100, 220, this));

        }


        for (int i = 0; i < zPop; i++) {
            zA.add(new Zombie(i * 100, 380, this));

        }

    }

    public void draw() {
        background(0);
        stroke(255);
        strokeWeight(4);
        fill(255);

        text("Human population: " + hPopDisplay , 350, 30);
        text("Zombie population: " + zPopDisplay , 350, 570);





        for(int i = 0; i < hA.size(); i++) {
            hA.get(i).draw();
            hA.get(i).update();
        }

        for(int i = 0; i < zA.size(); i++) {
            zA.get(i).update();
            zA.get(i).draw();
        }

        /**
         * 1.) get a human from human arrayList
         * 2.) get a zombie from the zombie arrayList
         * 3.) check if human and zombie are touching
         * 4.) if yes, handle it - print "touching"
         * 5.) else, get another zombie form the zombie arrayList
         *
         */

        for(int i = hA.size() -1; i >= 0; i-- ) {
            for(int j = 0; j < (zA.size() -1) ; j++) {
                hA.get(i).colDet(zA.get(j));
                if(hA.get(i).getColCheck() == true) {
                    hA.remove(i);
                    zPopDisplay--;
                }

            }
        }


    }


}