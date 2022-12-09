package ex1.test;

public class Omoktest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j != 2)
					System.out.printf("%c", '┼');
				else if (j == 2) {
					System.out.printf("%c", '○');
				}
			}
			System.out.println("");
		}
//			--------------------------------------------------
		for (int i = 0; i < 100; i++) {
			{
				if (i == 22)
					System.out.printf("%c", '○');

				else
					System.out.printf("%c", '┼');

				if (i % 10 == 9)
					System.out.printf("\n");
			}
		}

	}// main

}// class
