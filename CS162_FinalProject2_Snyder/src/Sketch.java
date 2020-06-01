import processing.core.PApplet;

import java.util.ArrayList;

public class Sketch extends PApplet {
    Human h;

    public void settings() {
        size(800,600);
    }

    public void setup() {
        h = new Human(100, 100, this);
    }

    public void draw() {
        h.draw();
        h.update();
    }

}