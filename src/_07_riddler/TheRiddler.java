package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles



String answer = JOptionPane.showInputDialog("Who makes it, has no need of it.\r\n" + 
		"Who buys it, has no use for it.\r\n" + 
		"Who uses it can neither see nor feel it.\r\n" + 
		"What is it?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equalsIgnoreCase("coffin")) {
	score++;
	JOptionPane.showMessageDialog(null, "correct!");
	
}
		// 5. Otherwise, say "wrong" and tell them the answer
	else {
		JOptionPane.showMessageDialog(null, "Wrong");
	}
JOptionPane.showMessageDialog(null, String.valueOf(score));
		// 6. Add some more riddles

String anaswer = JOptionPane.showInputDialog("I am a word of six;\r\n my first three letters refer to an automobile;\r\n my last three letters refer to a household animal;\r\n my first four letters is a fish;\r\n my whole is found in your room.\r\n What am I?");

if(anaswer.equalsIgnoreCase("carpet")) {
	score++;
	JOptionPane.showMessageDialog(null, "correct!");

}
else {
	JOptionPane.showMessageDialog(null, "wrONG");
}


		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, String.valueOf(score));
	
	}
}

