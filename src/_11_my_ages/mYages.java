package _11_my_ages;

import org.jointheleague.graphical.robot.Robot;

public class mYages {
	public static void main(String[] args) {
		
	Robot Potato = new Robot();
	Potato.setSpeed(60);
	Potato.turn(-180);
	Potato.move(200);
	Potato.penDown();
	Potato.turn(90);
  
//for (int i = 0; i <4; i++) {


Potato.move(200);

   
Potato.turn(180);
Potato.move(100);
Potato.turn(-90);
Potato.move(300);
Potato.turn(-130);
Potato.move(100);
Potato.penUp();
Potato.turn(130);
Potato.turn(90);
Potato.move(300);
Potato.penDown();
Potato.move(50);

for(int i = 0; i <3; i++){
		Potato.turn(50);
		Potato.move(80);		
	}
Potato.turn(210);
Potato.move(80);
Potato.turn(180);
Potato.penUp();
Potato.move(160);
}
}