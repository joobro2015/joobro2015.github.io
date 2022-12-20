---
title: ExamConsole.java
tags: java

---

```java

package ex5.has_a;

import java.util.Scanner;

public class ExamConsole {
	private Exam exam;
	
	public ExamConsole() {
		exam = new Exam();
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);

		System.out.println("┌─────────────────────────┐");
		System.out.println("│           성적입력         │");
		System.out.println("└─────────────────────────┘");
		int kor, eng, math;
		do {
			System.out.print("국어 : ");
			kor = scan.nextInt();

			if (kor < 0 || kor > 100)
				System.out.println("잘못 입력하셨습니다. 0~100이하의 숫자만 입력해주세요");
		} while (kor > 100 || kor < 0);
		exam.setKor(kor); // setter 애칭 
		do {
			System.out.print("영어 : ");
			eng = scan.nextInt();

			if (eng < 0 || eng > 100)
				System.out.println("잘못 입력하셨습니다. 0~100이하의 숫자만 입력해주세요");
		} while (eng > 100 || eng < 0);
		exam.seteng(eng); // setter 애칭
		do {
			System.out.print("수학 : ");
			math = scan.nextInt();

			if (math < 0 || math > 100)
				System.out.println("잘못 입력하셨습니다. 0~100이하의 숫자만 입력해주세요");
		} while (math > 100 || math < 0);
		exam.setmath(math); // setter 애칭
	}
	
	
	
	
	public void print() {
		print('-', 30); // 기본값을 가지는 함수
		
	}
	public void print(char ch) {
		System.out.printf("kor :%d\n  ", exam.getKor());
		System.out.printf("eng :%d\n  ", exam.getEng());
		System.out.printf("math :%d\n  ",exam.getMath());
		for(int i = 0; i <30; i++) {
			System.out.printf("%c", ch);}
		System.out.println();
		
	}
	public void print(char ch, int length) {
		int total = exam.total();
		double avg = exam.avg();
		
		System.out.printf("kor :%d\n  ", exam.getKor());
		System.out.printf("eng :%d\n  ", exam.getEng());
		System.out.printf("math :%d\n  ", exam.getMath());
		System.out.printf("toatl :%d\n  ", total);
		System.out.printf("avg :%.2f\n  ", avg);
		for(int i = 0; i <length; i++) {
			System.out.printf("%c", ch);}
		System.out.println();
	}
	
}



```