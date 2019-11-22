void setup() {
    size(500, 500);
}
void draw() {
    background(#FFFFFF);
    noStroke();
    fill(#F50F0F);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#337652);
    rect(176, 103, 12, 32);
    if (mousePressed) {
       fill(#FFFFFF);
       ellipse(150, 200, 151, 151);
}
}
