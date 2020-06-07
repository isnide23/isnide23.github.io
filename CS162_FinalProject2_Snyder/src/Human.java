import processing.core.PApplet;

public class Human {
    Particle particle;
    int xC;
    int yC;
    float randRadius;
    PApplet p;
    boolean colCheck = false;

    public Human() {

    }

    public Human(int xC, int yC, PApplet p){
        this.xC = xC;
        this.yC = yC;
        this.randRadius = p.random(60, 100);
        this.p = p;
    }

    public void draw() {
        p.fill(200);
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

    public void colDet(Zombie other) {
        if((randRadius / 2) + (other.getRandRadius() / 2)  >= p.dist(xC, yC, other.xC, other.yC)) {
            p.text("HIT" , 200, 200);
            this.colCheck = true;
        }

    }

    public boolean getColCheck() {
        return colCheck;
    }

    public float getRandRadius() {
        return randRadius;
    }


}
