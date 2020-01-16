package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String tod="You have a great moustache";
String helga="Your broomstick looks nice. And you're good at potions.";
String jackie="I like your shoes";
String other="Well who are you?";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String namae = JOptionPane.showInputDialog("O-namae wa nan desu ka?");
if(namae.equalsIgnoreCase("tod")) {
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	JOptionPane.showMessageDialog(null, tod);
	System.out.println(tod);
	}
else if(namae.equalsIgnoreCase("helga")){
	JOptionPane.showMessageDialog(null, helga);
	System.out.println(helga);
	
}
else if(namae.equalsIgnoreCase("jackie")){
	JOptionPane.showMessageDialog(null, jackie);
	System.out.println(jackie);
}
else {
	JOptionPane.showMessageDialog(null, other);
	System.out.println(other);
}
}
}
