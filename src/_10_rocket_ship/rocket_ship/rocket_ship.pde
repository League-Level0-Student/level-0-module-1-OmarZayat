int x = 400; 
int y = 600; 

void setup() {
frameRate(60);
 background(0, 0, 40); size(800, 800);

}

void draw() {
background(0, 0, 40); size(800, 800);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    ellipse(x,y+20,70,200);
    fill(#1A1919);
    ellipse(x,y-20,50,80);
    fill(#B7B3B3);
    ellipse(100,200,150,150);
    y  --;
    if (y < 0){
      y = 800;
}
}
