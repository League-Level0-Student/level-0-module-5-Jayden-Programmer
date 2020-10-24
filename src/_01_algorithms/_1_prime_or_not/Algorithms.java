package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Algorithms {
	public static void main(String[] args) {
		String Algorithm = JOptionPane.showInputDialog(null, "type a random number here");
		int Variable = Integer.parseInt(Algorithm);
		boolean isprime = true;
		for (int i = 2; i < Variable; i++) {
			if (Variable % i== 0) {
				isprime = false;
				break;
			}
		}
		if (isprime) {
			System.out.println("The number is prime");
		} else {  
			System.out.println("The number is not prime");   
		}
	}
} 
