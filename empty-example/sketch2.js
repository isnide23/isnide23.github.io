function setup() {
    createCanvas(1200,600);
}

function draw() {
    background(204);
    fill(250,0,0);
    ellipse(600,300,200,300);
    strokeWeight(10);
    fill(0,250,250,120);
    ellipse(600,300,300,200);
    strokeWeight(10);
    fill(0,0,200,50);
    ellipse(600,300,300,300);
    strokeWeight(10);
    fill(255);
    ellipse(630,280,45,30);
    ellipse(570,280,45,30);
    fill(0,0,255);
    ellipse(630,280,20,20);
    fill(0,0,255);
    ellipse(570,280,20,20);
    fill(255);
    ellipse(600,370,45,30);
    triangle(600,300,580,335,620,335);
}