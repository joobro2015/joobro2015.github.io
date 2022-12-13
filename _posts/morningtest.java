package prj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morningtest {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int count = 0;
		int max = -1;
		int index = -1;

		FileInputStream fis = new FileInputStream("res\\data.txt");

		Scanner scan = new Scanner(fis); // fis의 값을 읽어오겠다.

		String line = scan.nextLine(); // 메모장 내용을 전부 들고오기
//		line = "20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 "

		String[] tokens = line.split(" "); // " " 공백을 기준으로 토큰에 넣어주기
		
		
		
		// line ["20 30 29 39 49 38 10 19 87 29 38 27 8 90 87 "]
//		max = Integer.parseInt(tokens[0]);
		for(int i = 0; i < tokens.length; i++) 
			if(max < Integer.parseInt(tokens[i])) 
				max = Integer.parseInt(tokens[i]);
		
				System.out.printf("max : %d", max);
		
//			if (Integer.parseInt(tokens[i]) == 10)
//				index = i;
				
//				System.out.printf("index : %d 입니다.", index);
//		}

//		while(scan.hasNext()) {
//			scan.next();
//			count++;
//		System.out.println(count);
		
}// main

}// class
