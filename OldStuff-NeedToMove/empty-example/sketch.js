function setup() {
  createCanvas(1200,600);
}

function draw() {
if (mouseIsPressed) {
fill(250,0,0);
} else {
fill(0,0,240);
}
ellipse(mouseX, mouseY, 80, 80);
fill(0,250,0);
}
