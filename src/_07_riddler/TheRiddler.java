package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String noob1 = JOptionPane.showInputDialog("What has hands but can not clap?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (noob1.equals("No applause")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = (score + 1);
		} else {
			JOptionPane.showMessageDialog(null,"Wrong! the answer was No applause");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String noob12 = JOptionPane.showInputDialog("What is pink that could be thick or soft?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (noob12.equals("An eraser")) {
			JOptionPane.showMessageDialog(null,"Correct!");
			score = (score + 1);
		} else {
			JOptionPane.showMessageDialog(null,"YOU ARE SO DIRTY MINDED GO SEE A THERAPIST! btw the anser was An eraser");
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "your score is " + score);
		if (score == 2) {
			JOptionPane.showMessageDialog(null,"You WIN!");
		} else {
			JOptionPane.showMessageDialog(null,"You lose");
		}
	}
}

