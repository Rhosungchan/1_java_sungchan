package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num=sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i+" ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
//===============================================================		
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		
		if (num >= 1) {
			for (int i = num; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
//===============================================================		
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			System.out.print(i);
			sum += i;
			if(i==num) {
            System.out.print(" = ");  
			} else {
				System.out.print(" + ");
			}
		} 
		System.out.println(sum);
	}
//===============================================================
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번쩨 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번쩨 숫자 : ");
		int  num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >=1) {
			for(int i = num1 ; i <= num2 ; i++) {
				System.out.print(i+" ");
			}
		} if(num1 >= 1 && num2 >=1) {
			for(int i = num2 ; i <= num1 ; i++) {
				System.out.print(i+" ");
		    }
		} else {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
//===============================================================	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===="+num+"단"+"====");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
	}
//===============================================================
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num=sc.nextInt();
		
		if(num>=2 && num<=10) {
			for(int i = num; i<=9 ; i++) {
				System.out.println("===="+i+"단====");
			}
		} else {
			System.out.println("2~9 사이 숫자만 입려해주세요");
		}
	}	
//=============================================================== 6번까지 퍼펙트
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1 ; i<=num; i++) {
			for(int x = 1; x <=i ; x++) {                
				System.out.print("*");
			} System.out.println();
		} 
	}
//=============================================================== 7번까지 퍼펙트
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int i =num ; i>=1; i--) {
			for(int x = i; x >=1 ; x--) {                
				System.out.print("*");
			}
			System.out.println();
		}
    }
//=============================================================== 8번까지 퍼펙트
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
			
			for (int i = 0; i < num; i++) {
				for (int j = num - 1; j > i; j--)
					System.out.print(" ");
				
				for (int j = 0; j < i + 1; j++)
					System.out.print("*");
				System.out.println();
			}
			
			sc.close();
		
	}
	public void practice10() {}
	public void practice11() {}
	public void practice12() {}
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 00) {
				System.out.print(" " + i + " ");
			}
			if (i % 2 == 0 && i % 3 == 0) {
				count++;
			}
		}
		System.out.println("\ncount : " + count);
	}
}
	
	
	

	
