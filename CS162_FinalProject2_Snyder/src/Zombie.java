import processing.core.PApplet;

public class Zombie {
    Particle particle;
    int xC;
    int yC;
    PApplet p;

    public Zombie(int xC, int yC, PApplet p){
        this.xC = xC;
        this.yC = yC;
        this.p = p;
    }

    public void draw() {
        p.ellipse(xC, yC, 100, 100);
    }

    public void update() {
        //generate random number between zero and 100
        int rNum = (int) p.random(0, 100);

        //if random number is generate is zero, move up
        if(rNum > 0 && rNum < 25) {
            yC += 1;
        }
        //if 1, move down
        if(rNum >= 25 && rNum < 75) {
            yC -= 1;
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
}

