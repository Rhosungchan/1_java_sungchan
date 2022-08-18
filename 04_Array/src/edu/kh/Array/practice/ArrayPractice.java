package edu.kh.Array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void ex1() {

		int[] arr = new int[9];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;

		int sum = 0;

		for (int i = 0; i < 9; i++) {
			System.out.print(arr[i] + " ");

			if (i % 2 == 0) {

				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 합계 : " + sum);

	}

	public void ex2() {
		int[] arr = new int[9];

		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		arr[7] = 8;
		arr[8] = 9;

		int sum = 0;

		for (int i = 8; i >= 0; i--) {
			System.out.print(arr[i] + " ");

			if (i % 2 == 1) {

				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 합계 : " + sum);

	}

	public void ex3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = i + 1;

			System.out.print(arr[i] + " ");
		}

	}
	
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("입력 "+ (i)+" : "  );
			arr[i] = sc.nextInt();
			
		} 
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			if(input==arr[i]) {
				System.out.println("인덱스 : "+ i);
				flag = false;
			} 
		}  if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");     // flag기능 복습하기
		}
			
		}
		
		
		 
			  
		  
	
	
	
	
	
}
