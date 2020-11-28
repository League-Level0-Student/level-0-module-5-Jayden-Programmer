package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {

	public static void main(String[] args) {
		skill1();
		skill2();
		skill3();
		skill4();
		cars(2);
		skill5();
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
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	static void skill3() {
		Random ran = new Random();
		int num = ran.nextInt(21);
		System.out.println(num);
		Random ron = new Random();
		int number = ron.nextInt(11);
		System.out.println(number);
		JOptionPane.showMessageDialog(null, "The answer is" + (num - number));

	}

	static void skill4() {
		String city = JOptionPane.showInputDialog("What city do you live in?");
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city!");
		} else
			JOptionPane.showMessageDialog(null, "Move to San Diego now!");
		{
		}

	}

	static void cars(int num) {
		int cars = 2;
		if (cars == 1) {
			JOptionPane.showMessageDialog(null,
					"Copy this link and paste it so you can see a odel of a car https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/design-of-a-sculpted-car-with-sculpting-tools-royalty-free-image-1584895346.jpg?crop=1xw:0.87481xh;center,top&resize=640:*");
			if (cars == 0) {
				JOptionPane.showMessageDialog(null, "I bet you use public transportation");
				if (cars >= 1) {
					JOptionPane.showMessageDialog(null,
							"Here are wheels or whatever the instructions just said https://www.tirerack.com/content/dam/tirerack/desktop/components/hero/Wheels_0419.jpg");
				}
			}
		}
	}

	static void skill5() {
		String school = JOptionPane.showInputDialog(null, "What school do you go to?"); 
		JOptionPane.showMessageDialog(null, "Wow! "+ school +" is fantastic!"); 
	} 
}
