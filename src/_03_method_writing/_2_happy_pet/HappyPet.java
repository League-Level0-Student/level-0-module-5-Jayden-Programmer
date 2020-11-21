package _03_method_writing._2_happy_pet;

import javax.swing.JOptionPane;

public class HappyPet {

	// 2. Add the following variable to the next line: static int happinessLevel =
	// 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in
		// a variable
		String pet = JOptionPane.showInputDialog(null, "What kind of pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while (happinessLevel < 10) {

			if (pet.equals("ur mom")) {
				JOptionPane.showMessageDialog(null,"ur mom pet is not released yet and you would have to wait to purhcase it for a low low price of $90");
			}
			// 3. Use showOptionDialog to ask the user what they want to do to make their
			// pet happy
			// (eg: cuddle, food, water, take a walk, groom, clean up poop).
			// Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to make your pet happy?", "Pet happiness",
					0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Feed", "take it on a walk", "cuddle" },
					null);
			if (task == 0) {
				feed();
			}
			if (task == 1) {
				takeitonawalk();
			}
			if (task == 2) {
				cuddle();
			}
		}
	}

	static // 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	// user that he loves his pet and use break; to exit for loop.

	// 4. Create methods to handle each of your user selections.
	// Each method should create a pop-up with the pet's response (eg. cat might
	// purr when pet),
	// and INCREMENT the pet's happiness Level.
	void feed() {
		happinessLevel++;
		JOptionPane.showMessageDialog(null, "the pet is happy and joyfull");
	}

	static void takeitonawalk() {
		happinessLevel++;
		JOptionPane.showMessageDialog(null, "the pet is exercised and now is pretty strong");
	}

	static void cuddle() {
		happinessLevel++;
		JOptionPane.showMessageDialog(null, "the pet is happy and is now purring or barking ");
	}
}
