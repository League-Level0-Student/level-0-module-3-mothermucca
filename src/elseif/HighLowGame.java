//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		// 2. Print out the random variable above
		System.out.println(random);
		int guess = 0;
		
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String guessString = JOptionPane.showInputDialog("Guess a number between 1 and 100");

			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			guess = Integer.parseInt(guessString);
			
			// 5. if the guess is correct
			if (guess == random) {
				// 6. win
				JOptionPane.showMessageDialog(null, "You win!");
				break;
			} else if ( guess > random ) {
			// 7. if the guess is high
				// 8. tell them it's too high
				JOptionPane.showMessageDialog(null, "Too high. Guess again.");
			} else {
			// 9. if the guess is low
				// 10. tell them it's too low
				JOptionPane.showMessageDialog(null, "Too low. Guess again.");
			}
		}
		// 12. tell them they lose
		if (guess != random) {
			JOptionPane.showMessageDialog(null, "You lose.");
		}

	}

}


