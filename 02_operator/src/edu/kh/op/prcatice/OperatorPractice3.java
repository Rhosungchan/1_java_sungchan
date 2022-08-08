package edu.kh.op.prcatice;

import java.util.Scanner;

public class OperatorPractice3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		 int input = sc.nextInt();
		 
		String result1 = (input == 0) ? "0" : (input > 0 ? "양수" : "음수");
		System.out.println(result1+"입니다.");
		
	}

}
