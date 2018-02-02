
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot robot = new Robot();
		
		for (;;) {
			//3. ask the user what color they would like the robot to draw
			String colorName = JOptionPane.showInputDialog("Do you want red, green, or blue?");
			
			//4. use an if/else statement to set the pen color that the user requested
	        //5. if the user doesn’t enter anything, choose a random color
			if (colorName.equals("red")) {
				robot.setPenColor(Color.RED);
			} else if (colorName.equals("green")) {
				robot.setPenColor(Color.GREEN);
			} else if (colorName.equals("blue")) {
				robot.setPenColor(Color.BLUE);
			} else {
				robot.setPenColor(new Color(new Random().nextInt()));
			}
	
	        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//2. set the pen width to 10
			robot.setPenWidth(10);
			robot.setSpeed(100);
			
		    //1. make the robot draw a shape (this will take more than one line of code)
	
			robot.penDown();
			robot.move(100);
			robot.turn(90);
			robot.move(100);
			robot.turn(90);
			robot.move(100);
			robot.turn(90);
			robot.move(100);
			robot.turn(90);
		}
	}
}
