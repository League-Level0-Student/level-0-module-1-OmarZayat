
void setup() {
    size(800, 550);
}
void draw() {
PImage pizza_box = loadImage("Pizza_Box.JPG");
image(pizza_box, 0, 0, 800, 550);
    fill(#D8D25C);
ellipse(400, 225, 160, 160);
fill(#E83F3F);
ellipse(400, 225, 150, 150);
fill(#EDE545);
ellipse(400, 225, 145, 145);
if (mousePressed && (mouseButton == RIGHT)) {
PImage pepperoni = loadImage("mushroom-512.png");
image(pepperoni, 400, 225, 50, 50);
PImage tomato = loadImage("vegetable.png");
image(tomato, 360, 180, 50, 50);
PImage pepperoni1 = loadImage("mushroom-512.png");
image(pepperoni1, 400, 180, 50, 50);
PImage tomato1 = loadImage("vegetable.png");
image(tomato1, 350, 230, 50, 50);

}
}
