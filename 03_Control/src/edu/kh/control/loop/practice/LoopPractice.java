package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
						
	      if(num>0) {
	      }else {
	    	  System.out.println("1이상의 숫자를 입력해주세요");
	      }
	      
	      for(int i =1; i<=num;i++ ) {
	    	  System.out.print(i);
	      }
		}
		
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num>=1) {
		for(int i = num ; i >= 1 ; i--) {
			System.out.print(i);
			}
	   	} else {
	   	 System.out.println("1이상의 숫자를 입력해주세요");
	   	}
	}
	   

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i =1; i <= num; i++ ) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지의 합 : %d",1,num,sum);
	}

	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		if(num1 >= 1 && num2 >= 1) {
			
			for(int i = num1 ; i <= num2; i++) {
				System.out.print(i);
			}
			
		}  if(num1 >= 1 && num2 >= 1) {
			for(int i = num2 ; i <= num1; i++) {
				System.out.print(i);
			}
		} 	else  {
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		   int num = sc.nextInt();
		   
		   System.out.println("==="+num+"단===");
		   for(int i = 1; i<=9 ; i++) {
			   System.out.printf("%d X %d = %d\n", num, i , i*num);
			   
		   }
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		   int num = sc.nextInt();
		
		   if(num<=1 && num <= 10 ) {
			   System.out.println("2~9 사이 숫자만 입력해주세요");
		   } else {
			   for(int i = num; i <= 9; i++) {
				   System.out.println("===="+i+"단====");
			   }
		   }
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		
		for(int i =1 ; i<=num; i++) {
			for(int x = 1; x <=i ; x++) {                
				System.out.print("*");
			}
			System.out.println();
		}
	}
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
	public void practice9() {}
	public void practice10() {}
	public void practice11() {}
	public void practice12() {}
	public void practice13() {}
		
//		for(int a =1 ; a<=3; a++) {
//			for(int b = 1; b <= 3; b++ ) {
//				System.out.print(b);
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

	
