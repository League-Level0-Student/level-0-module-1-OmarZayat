
void setup() {
size(800,800);
}
void draw() {
PImage face = loadImage("meme1.jpg");
image(face, 0, 0, 800, 800);
fill(#FFFFFF);
ellipse(179,300,250,250);
ellipse(600,160,250,250);
fill(#ED0202);
fill(mouseX,mouseY,0);
ellipse(179,300,200,200);
ellipse(600,160,200,200);
}
