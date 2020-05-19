import processing.core.PApplet;

public class DrawEllipse {

    PApplet e;

    public DrawEllipse(PApplet e) {
        this.e = e;
    }

    public void draw() {
        e.ellipse(400, 400, 100, 300);
        e.ellipse(300, 400, 300, 100);
        e.ellipse(200, 400, 200, 200);
        e.ellipse(100, 400, 150, 250);
    }
}
