import processing.core.PApplet;

public class Zombie {
    int xC;
    int yC;
    float randRadius;
    PApplet p;

    public Zombie() {

    }

    public Zombie(int xC, int yC, PApplet p) {
        this.xC = xC;
        this.yC = yC;
        this.randRadius = p.random(60, 100);
        this.p = p;
    }

    public void draw() {
        p.fill(50, 168, 119);
        p.circle(xC, yC, randRadius);

    }

    public void update() {
        //generate random number between zero and three
        int rNum = (int) p.random(0, 100);

        //if random number generated is zero, move up
        if(rNum > 0 && rNum < 25) {
            yC -= -1;
        }
        //if 1, move down
        if(rNum >= 25 && rNum < 75) {
            yC += -1;
        }
        //if 2 move right
        if(rNum >= 75 && rNum < 90) {
            xC += -1;
        }
        //if 3 move left
        if(rNum >= 90 && rNum <100) {
            xC -= -1;
        }
    }


    public void vanish() {
        p.fill(0,0);
        p.noStroke();
    }

    public float getRandRadius() {
        return randRadius;
    }
}
