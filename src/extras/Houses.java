package extras;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		Robot robot = new Robot("mini", 0, 500);
		robot.setPenWidth(5);
		robot.setSpeed(100);
		Random random = new Random();
		Robot.setWindowColor(new Color(0x000028));
		
		drawGrass(robot, 20);
		drawPeakedRoofHouse(robot, 200, 40, Color.WHITE);
		
		drawGrass(robot, 20);
		for (int i = 1; i < 10; i++) {
			drawHouse(robot, random.nextInt(401)+100, 40, new Color(random.nextInt()));
			drawGrass(robot, 20);
		}


	}
	
	public static void drawGrass(Robot robot, int width) {
		robot.setPenColor(new Color(0x008800));
		robot.setAngle(90);
		robot.penDown();
		robot.move(width);
		robot.penUp();
	}
	
	public static void drawHouse(Robot robot, int height, int width, Color color) {
		if (height < 300) {
			System.out.println("peaked " + height);
			drawPeakedRoofHouse(robot, height, width, color);
		} else {
			System.out.println("flat " + height);
			drawFlatTopHouse(robot, height, width, color);
		}
			
	}
	public static void drawFlatTopHouse(Robot robot, int height, int width, Color color) {
		robot.setAngle(0);
		robot.setPenColor(color);
		robot.penDown();
		robot.move(height);
		robot.turn(90);
		robot.move(width);
		robot.turn(90);
		robot.move(height);
		robot.penUp();
	}
	
	public static void drawPeakedRoofHouse(Robot robot, int height, int width, Color color) {
		robot.setAngle(0);
		robot.setPenColor(color);
		robot.penDown();
		robot.move(height - width/2);
		robot.turn(45);
		// use pythagorean theorem to get distance for sloped roof
		Double d = Math.sqrt(width/2*width/2 + width/2*width/2);
		int roofDistance = d.intValue();
		robot.move(roofDistance);
		robot.turn(90);
		robot.move(roofDistance);
		robot.turn(45);
		robot.move(height - width/2);
		robot.penUp();		
	}
}
