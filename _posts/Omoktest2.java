package ex1.test;

public class Omoktest2 {

	public static void main(String[] args) {

//		----------------------------------------------------------------
		for (int y = 1; y <= 10; y++) {
		for (int x = 1; x <= 10; x++) 
			if (x == 3 && y == 3)
				System.out.printf("%c", '○');
			else if(x == 1 && y == 1)
				System.out.printf("%c", '┌');
			else if(x == 10&& y == 1)
				System.out.printf("%c", '┐');
			else if(y == 1)
				System.out.printf("%c", '┬');
			else
				System.out.printf("%c", '┼');
		System.out.println("");
		}


//		--------------------------------------------------------------------
	}// main

}// class
