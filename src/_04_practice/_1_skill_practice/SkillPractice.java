package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
	skill1(); 
	skill2(); 
	}

	static void skill1() {
		String variable = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		String dimes = JOptionPane.showInputDialog(null, "how many cents do you have");
		String inches = JOptionPane.showInputDialog(null, "How tall are you in inches?");
		int num = Integer.parseInt(inches);
		if (num < 36) {
			JOptionPane.showMessageDialog(null, "eat your wheaties!");
		}
	}

	static void skill2() {
	for (int i = 1; i < 31; i++) {
	if(i%3 ==0) {
	System.out.println(i); 
	}
	}

	}
}
