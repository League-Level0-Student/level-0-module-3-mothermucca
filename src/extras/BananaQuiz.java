//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String bananas = JOptionPane.showInputDialog("Do you like bananas?");
		
		if (bananas.equals("no")) {
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
			JOptionPane.showMessageDialog(null, "You're crazy!");
		} else if (bananas.equals("yes")) {
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
			String hobby = JOptionPane.showInputDialog("What's your favorite hobby?");
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		} else {
		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
			JOptionPane.showMessageDialog(null, "You are bananas!");
		}
	
	}

}
