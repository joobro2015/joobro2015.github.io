package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ExamApp {
	public static void main(String[] args) throws IOException {

		int k = 1;
		int[] kors = new int[3];
		int total;
		double avg;
		
		NEWLEC: while (k == 1) {

			

			
			int menu;
			{
				Scanner scan = new Scanner(System.in);
				System.out.println("┌─────────────────────────┐");
				System.out.println("│           메인 메뉴        │");
				System.out.println("└─────────────────────────┘");

				System.out.println("         1. 성적입력");
				System.out.println("         2. 파일 불러오기");
				System.out.println("         3. 성적출력");
				System.out.println("         4. 파일저장");
				System.out.println("         5.   종료");
				System.out.println("         >       ");
				menu = scan.nextInt();
			}

//			1.	성적입력블록.

//				System.out.println("1번검사 전");
			switch (menu) {
			case 1: {
				Scanner scan = new Scanner(System.in);

				System.out.println("┌─────────────────────────┐");
				System.out.println("│           성적입력         │");
				System.out.println("└─────────────────────────┘");
				for (int i = 0; i < 3; i++) {
					int kor;

					do {
						System.out.printf("kor%d : ", i + 1);
						kor = scan.nextInt();

						if (kor < 0 || kor > 100)
							System.out.println("잘못 입력하셨습니다. 0~100이하의 숫자만 입력해주세요");
					} while (kor > 100 || kor < 0);

					kors[i] = kor;
				}
			}
				break;

//		-------------------------------------------------------------------------------------------------
//		2.파일입력 블록

//				System.out.println("2번검사 전");
			case 2: {
				FileInputStream fis = new FileInputStream("res\\data.csv"); // 스트림 객체
				Scanner scan = new Scanner(fis);

				String line = scan.nextLine();

				String[] tokens = line.split(",");
				for (int i = 0; i < 3; i++) {
					kors[i] = Integer.parseInt(tokens[i]);

				}

				scan.close();
				fis.close();

				// 무조건 먼저하기
				// 문자열 단위로 입력 할 때 응용객체 scanner
				// 문자열 단위로 출력 할 때 응용객체 print

			}
				break;

//	3.성적출력	-------------------------------------------------------------------------------------------------

//				System.out.println("3번검사 전");
			case 3: {

				System.out.println("┌─────────────────────────┐");
				System.out.println("│           성적출력         │");
				System.out.println("└─────────────────────────┘");

				for (int j = 0; j < 3; j++) {
					total = 0;

					for (int i = 0; i < 3; i++)
						total += kors[i];
					avg = total / 3.0;

					System.out.printf("<%d>----------------------------------\n", j + 1);

					for (int i = 0; i < 3; i++)
						System.out.printf("국어%d : %3d\n", i + 1, kors[i]);
					System.out.printf("총점 : %3d\n", total);
					System.out.printf("평균 : %6.2f\n", avg);

				}

			}

				break;

			// ----------------------------------------------------------------------------------------------------------------
//			4.	파일저장 블럭

//				System.out.println("4번검사 전");

			case 4: {
				FileOutputStream fos = new FileOutputStream("res\\data.csv"); // 스트림 객체
				PrintStream out = new PrintStream(fos);

				for (int i = 0; i < 3; i++)
					if (i == 2)
						out.printf("%d", kors[i]);
					else
						out.printf("%d,", kors[i]);

				fos.flush();
				fos.close(); // 반드시 해줘야한다.

				System.out.println("작업완료"); // 다 외우기

			}
				break;
//			-------------------------------------------------------------------------------------------------
//			5. 종료 블럭

			// System.out.println("5번검사 전");
			case 5: {
				Scanner scan = new Scanner(System.in);
				do {
					System.out.println("계속하시겠습니까? (계속 : 1 / 종료 : 0)");
					k = scan.nextInt();
					if (k >= 2 || k < 0)
						System.out.println("1과0만 입력해주세요");
				} while (k >= 2 ||k < 0);

			}

				break;

			default: {
				System.out.println("1부터 5까지만 입력해주세요.");

			}

				break NEWLEC;

			}// switch

		} // Newlec while
		System.out.println("bye~!");

	}// main
}// class