package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		String sign = JOptionPane.showInputDialog("What's your sign?");
		
		if (sign.equals("Aries")) {
			JOptionPane.showMessageDialog(null, "Your heart is apt to beat much more rapidly than usual, Aries. \nLove is in the air, the trees, and the people around you.");
		} else if (sign.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "More than likely there was at least one time in your life in which \nyou felt like the ugly ducking, Taurus. Today is a day to love every bit of yourself. Have pride in your body inside and out.");
		} else if (sign.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Duels of love and romance are apt to come to a critical climax, Gemini, \nand you’ll find that the person who is challenging you has quite a bit of gunpowder at his or her disposal. ");
		} else if (sign.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "Your extremely overpowering emotions are apt to scare people off today, Cancer, \nespecially when it comes to matters involving intimate relationships.");
		} else if (sign.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "While long-term trends in your life may not be going exactly the way you \nwant them to, Leo, you certainly have plenty of short-term pleasures to enjoy, especially today.");
		} else if (sign.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "You may be anxious to fit things in your life into pigeonholes, Virgo. \nWhen it comes to matters of love and romance, this may be hard to do, especially on a day like today.");
		} else if (sign.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "You may feel like going back to being a student in junior high, Libra, \njust going through puberty and joining the other kids in animated discussions about who likes whom and who’s going out with whom.");
		} else if (sign.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Be careful about getting caught up with people who are careless or fickle, Scorpio, \nespecially when it comes to matters of the heart.");
		} else if (sign.equals("Saggitarius")) {
			JOptionPane.showMessageDialog(null, "Your luck has just turned with regard to issues of love and romance, and wow! \nHas it turned for the better, Sagittarius!");
		} else if (sign.equals("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Romance is in the air, Capricorn, and all of a sudden you notice that all \naround you couples are walking hand-in-hand, exchanging longing gazes.");
		} else if (sign.equals("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Your upbeat and active nature is exactly what turns people on to you, Aquarius.");
		} else if (sign.equals("Pisces")) {
			JOptionPane.showMessageDialog(null, "Today is one of those days when you could feel lethargic and downbeat, Pisces.");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
	}
}
