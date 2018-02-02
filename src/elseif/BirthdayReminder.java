
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "September 10th";
		String dadsBirthday = "December 3rd";
		String myBirthday = "October 1st";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String who = JOptionPane.showInputDialog("Who's birthday?");
	
		// 3. Print out what the user typed
		System.out.println(who);
		
		// 4. if user asked for "mom"
		if (who.equals("mom")) {
			//print mom's birthday
			JOptionPane.showMessageDialog(null, momsBirthday);
		} else if (who.equals("dad")) {
		// 5. if user asked for "dad"
			// print dad's birthday
			JOptionPane.showMessageDialog(null, dadsBirthday);
		} else if (who.equals("Ann")) {
		// 6. if user asked for your name
			// print myBirthday
			JOptionPane.showMessageDialog(null, myBirthday);
		} else {
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}
	} 
}
