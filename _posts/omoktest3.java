package prj;

import java.io.FileInputStream;
import java.util.Scanner;

public class omoktest3 {
	public static void main(String[] args) {

//		----------------------------------------------------------------

		int ox, oy;

		System.out.println("oy, ox를 입력해 주세요");
		System.out.print("(y x)>");
		Scanner scan = new Scanner(System.in);
		oy = scan.nextInt();
		ox = scan.nextInt();

		System.out.printf("oy : %d,ox : %d\n", oy, ox);

		char[][] board = new char[10][10];
//		char[] board = new char[100];
	
		for (int y = 1; y <= 10; y++)
			for (int x = 1; x <= 10; x++)
				board[y - 1][x - 1] = '┼';

		for (int i = 0; i < 10; i++)
			board[0][i] = '┬';
		
		
		board[oy - 1][ox - 1] = '○';
//		board[oy - 1][ox - 1] = '●';

		for (int y = 1; y <= 10; y++) {
			for (int x = 1; x <= 10; x++)
				System.out.printf("%c", board[y - 1][x - 1]);

			System.out.println();
			}
		
		// 사용자로부터 다음 모양의 입력을 요청한다.
		// (x,y) > 3 4 -> nextInt(), nextInt()
		
	}// main

}
// class
