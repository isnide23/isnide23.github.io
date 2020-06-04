import processing.core.PApplet;

public class Human {
    Particle particle;
    int xC;
    int yC;
    float randRadius;
    PApplet p;

    public Human() {

    }

    public Human(int xC, int yC, PApplet p){
        this.xC = xC;
        this.yC = yC;
        this.randRadius = p.random(60, 100);
        this.p = p;
    }

    public void draw() {
        p.circle(xC, yC, randRadius);
    }

    public void update() {
        //generate random number between zero and three
        int rNum = (int) p.random(0, 100);

        //if random number generated is zero, move up
        if(rNum > 0 && rNum < 25) {
            yC -= 1;
        }
        //if 1, move down
        if(rNum >= 25 && rNum < 75) {
            yC += 1;
        }
        //if 2 move right
        if(rNum >= 75 && rNum < 90) {
            xC += 1;
        }
        //if 3 move left
        if(rNum >= 90 && rNum <100) {
            xC -= 1;
        }
    }

    public void colDet(Human other) {
        if(randRadius <= p.dist(xC, yC, other.xC, other.yC)) {
            this.xC *= -1;
            this.yC *= -1;
            other.xC *= -1;
            other.yC *= -1;
        }
    }
}
