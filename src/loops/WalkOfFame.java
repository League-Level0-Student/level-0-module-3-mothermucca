
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("batman");
		rob.setSpeed(100);
		
		for (int i = 0; i < 25; i++) {
			// 1. Set the X position of the robot so that it starts on the left. 
			// You also need to show the robot to see the result of this line.
			rob.setX(i*50);
			rob.penDown();
	
			// 3. Set the size of the star to 30.
			drawStar(rob, 30);
			rob.penUp();


		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */
		}
	}
		
	static void drawStar(Robot robot, int starSize) {
		// 2. Put the robot's pen down
		robot.penDown();

		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
		for(int i = 0; i < 5; i++) {

			// 1. Move the robot the distance of the starSize variable
			robot.move(starSize);
	
			// 3. Turn the robot 144 degrees
			robot.turn(144);
		}
		
			
	}

}
