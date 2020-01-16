String noob = "icecream";
    void setup(){
        size(1000,600);
 
    }
    void draw(){
     
        if(mousePressed){               //if the mouse is pressed 
            fill(mouseX,mouseY,0);                  //fill red 
        }
        else{                           //else
            fill(0,0,255);                  //fill green
        }
        PImage pepperoni = loadImage("aa.jpg");
     
image(pepperoni, mouseX, mouseY, 50, 50);
       text(noob + noob + "banana", mouseX, mouseY);   //using these variables makes this shape follow the mouse
    }
 
