package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String noob = JOptionPane.showInputDialog("what is the date of your birthday?");
		System.out.println(noob);
		if (noob.equals("11/21/19")) {
			JOptionPane.showMessageDialog(null,"Happy birtday!");
		} else {
			JOptionPane.showMessageDialog(null,"MERRy UNbirtday!");
		}
}
}