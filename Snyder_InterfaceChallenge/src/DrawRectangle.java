import processing.core.PApplet;

public class DrawRectangle {

    PApplet r;

    public DrawRectangle(PApplet r) {
        this.r = r;
    }

    public void draw() {
        r.rect(200, 400, 100, 300);
        r.rect(200, 300, 100, 300);
        r.rect(200, 200, 100, 300);
        r.rect(200, 100, 100, 300);

    }
}

