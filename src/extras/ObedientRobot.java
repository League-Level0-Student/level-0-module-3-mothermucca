package extras;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main(String[] args) {
		Robot robot = new Robot();

		
		String shape = JOptionPane.showInputDialog("What shape should I draw?");
		String color = JOptionPane.showInputDialog("What color? Red, green, or blue.");
		
		if (color.equals("red")) {
			robot.setPenColor(Color.RED);
		} else if (color.equals("green")) {
			robot.setPenColor(Color.GREEN);
		} else if (color.equals("blue")) {
			robot.setPenColor(Color.BLUE);
		}
			
		if (shape.equals("square")) {
			drawSquare(robot);
		} else if (shape.equals("triangle")) {
			drawTriangle(robot);
		} else if (shape.equals("circle")) {
			drawCircle(robot);
		} else {
			JOptionPane.showMessageDialog(null, "The shape choices are square, triangle, or circle");
		}
	}
	
	public static void drawSquare(Robot robot) {
		robot.penDown();
		robot.setSpeed(100);		
    	
		for (int i = 0; i < 4; i++) {
        	robot.move(200);
        	robot.turn(90);
		}
	}
	
	public static void drawTriangle(Robot robot) {
		robot.penDown();
		robot.setSpeed(100);
		
    	for (int i = 0; i < 3; i++) {
        	robot.move(200);
        	robot.turn(120);
		}
	}
	
	public static void drawCircle(Robot robot) {
		robot.penDown();
		
		robot.setSpeed(1);
    	for (int i = 0; i < 360; i++) {

        	try {
            	robot.microMove(1);
				robot.microTurn(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
