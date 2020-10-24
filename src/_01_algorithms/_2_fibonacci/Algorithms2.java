package _01_algorithms._2_fibonacci;

public class Algorithms2 {
	public static void main(String[] args) {
		int Num1 = 0;
		int Num2 = 1;
		int sum = 0;
		System.out.println(Num1);
		System.out.println(Num2); 
		for (int i = 0; i < 10; i++) {
		sum = Num1 + Num2;
		System.out.println(sum);
		Num1 = Num2;
		Num2 = sum; 
		} 
	}

}
