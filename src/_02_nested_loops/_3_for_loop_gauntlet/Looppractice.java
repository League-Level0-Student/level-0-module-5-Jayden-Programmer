package _02_nested_loops._3_for_loop_gauntlet;

public class Looppractice {
	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > -1; i--) {
			System.out.println(i);

		}
		for (int i = 2; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		for (int j = 1; j < 100; j++) {
			if (j % 2 == 1) {
				System.out.println(j);
			}
		}
		for (int j2 = 1; j2 < 501; j2++) {
			if (j2 % 2 == 1) {
				System.out.println(j2 + "odd");
			} else {
				System.out.println(j2 + "even");
			}
			for (int i = 7; i < 778; i++) {
				if (i % 7 == 0) {
					System.out.println(i);
				}
			}
			for (int i = 0; i < 14; i++) {
				System.out.println((2008 + i)+"I was"+i+"years old"); 
			}
		}
			for (int i = 0; i < 11; i++) {
				System.out.println((1+i)+"Things I like"+i+"I like things I like");
			}
			}

		
	}


