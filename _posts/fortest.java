package ex1.test;

public class fortest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for (i = 0; i < 5; i++) {
//			if(i ==2)
//			continue;
			if (i < 2) {
				continue;
			}
			System.out.print("☆");
			System.out.printf("%d", i + 1);
			if (i != 4) {
				System.out.print(',');
			}

//				if(i ==2)
//					break;
		} // for

	}// main

}// class
