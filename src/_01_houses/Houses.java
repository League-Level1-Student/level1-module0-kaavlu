package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();
	void slantRoof() {
		rob.turn(-30);
		rob.move(20);
		rob.turn(-120);
		rob.move(20);
		rob.turn(-30);
	}
	void flatRoof() {
		rob.turn(-90);
		rob.move(20);
		rob.turn(-90);
	}
	void drawHouse(String strHeight,Color color) {
		
		int height=0;
		
		if( strHeight.equals("small") ) {
			height=60;
		}else if(strHeight.equals("medium") ) {
			height=120;
		}else if(strHeight.equals("large") ){
			height=250;
		}
		rob.setPenColor(color);
		rob.setSpeed(20);
		rob.hide();
		rob.penDown();
		rob.turn(90);
		rob.setPenColor(color);
		rob.move(height);
		slantRoof();
		rob.move(height);
		rob.turn(90);
		rob.setPenColor(Color.GREEN);
		rob.move(15);
	}

	public void run() {
		rob.setSpeed(50);
		rob.hide();
		rob.turn(180);
		rob.move(250);
		rob.turn(-90);
		rob.move(400);
		rob.turn(-180);
		
		drawHouse("small", Color.YELLOW);

	}
}
