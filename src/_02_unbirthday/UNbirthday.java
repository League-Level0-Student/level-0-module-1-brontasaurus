package _02_unbirthday;

import javax.swing.JOptionPane;

public class UNbirthday {
	public static void main(String[] args) {
		String birth = JOptionPane.showInputDialog("What is your birthday? (mm/dd)");
		if(birth.equalsIgnoreCase("01/08")) {
			JOptionPane.showMessageDialog(null, "Happy Day Of Birth");
		}
	}

}
